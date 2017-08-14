package source;

import entity.Note;

public class View {
	public static final String INPUT_NAME = "Please, enter your name.";
	public static final String INPUT_FIRSTNAME = "Please, enter your first name.";
	public static final String INPUT_SECONDNAME = "Please, enter your second name.";
	public static final String NICKNAME = "Please, enter your nickname.";
	public static final String COMMENT = "Please, enter any comment. ";
	public static final String HOME_TELEPHONE = "Please, enter your home telephone.";
	public static final String MOBILE_TELEPHONE = "Please, enter yor mobile telephone.";
	public static final String SECOND_MOBILE_TELEPHONE = "Please, enter yor second mobile telephone.";
	public static final String EMAIL = "Please, enter your email.";
	public static final String SCYPE = "Please, enter your Skype.";
	public static final String ADDRESS_INDEX = "Please, enter your state Index.";
	public static final String ADDRESS_CITY = "Please, enter your city.";
	public static final String ADDRESS_STREET = "Please, enter your street.";
	public static final String ADDRESS_BUILDING = "Plese, enter your building number.";
	public static final String ADDRESS_FLAT = "Please, enter your flat number.";
	
	public static final String MESSAGE_RANGE = "Range for comment is 400 symbols.";
	public static final String ADD_NOTE = "Do you want to add new note? (push 'y' for yes or any symbol for no)";
	public static final String ADD_SECOND_TEL_NUM = "Do you want to add second telephone number? (push 'y' for yes or any symbol for no)";
	public static final String INCORRECT_INPUT = "Incorrect input data!";
	
	
	
	
	public View() {}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printWrongStringInput() {
		System.out.println("Wrong input data");
	}

	public String makeFullName(Note note) {
		return note.getFirstName() + " " + note.getName().charAt(0);
	}

	public String makeFullAddress(Note note) {
		return "Address: " + note.getAddressIndex() + ", " + note.getCity() + ", " + note.getStreet()
				+ ", building num. " + note.getBuildingNumber() + ", flat num. " + note.getFlatNumber();
	}
	
	public String getFullInfo(Note note) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Full name: " + note.getFullName() + "\n")
		.append("Nickname: " + note.getNickName() + "\n")
		.append("Comment: " + note.getComment() + "\n")
		.append("Home telephone: " + note.getTelephoneHome() + "\n")
		.append("Mobile telephon: " + note.getTelephoneMobile() + "\n")
		.append("Second mobile telephone: " + (note.getTelephoneMobileSecond() != null ? ( note.getTelephoneMobileSecond()) : "not entered") + "\n")
		.append("Email: " + note.getEmail() + "\n")
		.append("Skype: " + note.getSkype() + "\n")
		.append(note.getFullAddress() + "\n")
		.append(note.getDateCreate() + "\n")
		.append("Last changes date: " + (note.getLastChange() != null ? note.getLastChange() : "not modified"));
		
		return buffer.toString();
	}
}
