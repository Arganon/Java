

public class Controller {
	View view;
	NoteBook noteBook;
	Note note;
	
	public Controller(View view, NoteBook noteBook) {
		setView(view);
		setNoteBook(noteBook);
	}
	
	public void setView(View view) {
		this.view = view;
	}
	
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
	
	public void makeNewNote() {
		this.note = new Note();
	}
	
	public Note getNote() {
		return this.note;
	}
	
	public void addNote() {
		this.note.setFullName(this.view.makeFullName(this.note));
		this.note.setFullAddress(this.view.makeFullAddress(this.note));
		this.noteBook.addNote(this.note);
	}
	
	public void fillNote(String data, String typeOfData) {
		switch(typeOfData) {
			case "name":
				this.note.setName(data);
				break;
				
			case "surname":
				this.note.setFirstName(data);
				break;
				
			case "secondname":
				this.note.setSecondName(data);
				break;
				
			case "nickname":
				this.note.setNickName(data);
				break;
				
			case "comment":
				this.note.setComment(data);
				break;
				
			case "homeTelephone":
				this.note.setTelephoneHome(data);
				break;
				
			case "mobileTelephone":
				this.note.setTelephoneMobile(data);
				break;
				
			case "secondMobileTelephonee":
				this.note.setTelephoneMobileSecond(data);
				break;
				
			case "email":
				this.note.setEmail(data);
				break;
				
			case "skype":
				this.note.setSkype(data);
				break;
				
			case "addresIndex":
				this.note.setAddressIndex(data);
				break;
				
			case "city":
				this.note.setCity(data);
				break;
				
			case "street":
				this.note.setStreet(data);
				break;
				
			case "buildingNumber":
				this.note.setBuildingNumber(data);
				break;
				
			case "flatNumber":
				this.note.setFlatNumber(data);
				break;
		}
	}
}

