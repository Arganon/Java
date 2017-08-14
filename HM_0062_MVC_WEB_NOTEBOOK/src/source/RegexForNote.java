

public class RegexForNote {
	public static final String REGEX_FOR_FULL_NAME = "^([A-Z][a-z]+[\\-\\s]?)+$";
	public static final String REGEX_NICKNAME = "^[A-z0-9_-]{3,20}$";
	public static final String REGEX_TELEPHONE = "^([\\+\\d\\-\\(\\)\\s]){10,22}$";
	public static final String REGEX_EMAIL = "^[a-zA-Z1-9\\-\\._]+@[a-z1-9]+(.[a-z1-9]+){1,40}$";
	public static final String REGEX_INDEX = "^[\\d]{3,8}$";
	public static final String REGEX_CITY = "^([A-z\\-\\.]){2,20}$";
	public static final String REGEX_NUMBER = "^([A-z\\-\\d]){1,5}$";
	public static final String REGEX_STREET = "^([A-z\\-\\s\\d]){3,30}$";

}
