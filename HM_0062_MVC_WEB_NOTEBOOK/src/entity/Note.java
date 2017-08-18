package entity;

import java.util.Date;

public class Note {
	String name, firstName, secondName, fullName, nickname;
	String comment;
	// place for enum group (ADMIN, USER and etc.) not finished!
	String telephoneHome, telephoneMobile, telephoneMobileSecond;
	String email, skype;
	String addressIndex, city, street, buildingNumber, flatNumber, fullAddress;
	String dateCreate, lastChanges;

	public Note() {
		setDateCreate(new Date());
	}

	// ------------------------------------------------Setters

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setNickName(String nickname) {
		this.nickname = nickname;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setTelephoneHome(String telephone) {
		this.telephoneHome = telephone;
	}

	public void setTelephoneMobile(String telephone) {
		this.telephoneMobile = telephone;
	}

	public void setTelephoneMobileSecond(String telephone) {
		this.telephoneMobileSecond = telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public void setAddressIndex(String addressIndex) {
		this.addressIndex = addressIndex;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	private void setDateCreate(Date date) {
		this.dateCreate = String.format("Creating date: %tc", date);
	}

	public void setLastChange() {
		Date date = new Date();
		this.lastChanges = String.format("Last changes date: %tc", date);
	}

	// ------------------------------------------------Getters
	public String getFirstName() {
		return this.firstName;
	}

	public String getName() {
		return this.name;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public String getFullName() {
		return this.fullName;
	}

	public String getNickName() {
		return this.nickname;
	}

	public String getComment() {
		return this.comment;
	}

	public String getTelephoneHome() {
		return this.telephoneHome;
	}

	public String getTelephoneMobile() {
		return this.telephoneMobile;
	}

	public String getTelephoneMobileSecond() {
		return this.telephoneMobileSecond;
	}

	public String getEmail() {
		return this.email;
	}

	public String getSkype() {
		return this.skype;
	}

	public String getAddressIndex() {
		return this.addressIndex;
	}

	public String getCity() {
		return this.city;
	}

	public String getStreet() {
		return this.street;
	}

	public String getBuildingNumber() {
		return this.buildingNumber;
	}

	public String getFlatNumber() {
		return this.flatNumber;
	}

	public String getFullAddress() {
		return this.fullAddress;
	}

	public String getDateCreate() {
		return this.dateCreate;
	}

	public String getLastChange() {
		return this.lastChanges;
	}
}
