

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Controller controller;
	private NoteBook noteBook;
	private View view;
	
	public MyServlet() {
		this.noteBook = new NoteBook();
		this.view = new View();
		this.controller = new Controller(view, noteBook);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.controller.makeNewNote();
		this.controller.fillNote(request.getParameter("surname"), "surname");
		this.controller.fillNote(request.getParameter("name"), "name");
		this.controller.fillNote(request.getParameter("secondname"), "secondname");
		this.controller.fillNote(request.getParameter("nickname"), "nickname");
		this.controller.fillNote(request.getParameter("comment"), "comment");
		this.controller.fillNote(request.getParameter("homeTelephone"), "homeTelephone");
		this.controller.fillNote(request.getParameter("mobileTelephone"), "mobileTelephone");
		this.controller.fillNote(request.getParameter("secondMobileTelephonee"), "secondMobileTelephonee");
		this.controller.fillNote(request.getParameter("email"), "email");
		this.controller.fillNote(request.getParameter("skype"), "skype");
		this.controller.fillNote(request.getParameter("addresIndex"), "addresIndex");
		this.controller.fillNote(request.getParameter("city"), "city");
		this.controller.fillNote(request.getParameter("street"), "street");
		this.controller.fillNote(request.getParameter("buildingNumber"), "buildingNumber");
		this.controller.fillNote(request.getParameter("flatNumber"), "flatNumber");

		this.controller.addNote();
		response.setContentType("text/htm;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(this.view.getFullInfo(this.controller.getNote()));
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
