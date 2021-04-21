package org.cts.model;

public class Canditate {

	private String firstName;
	private String lastName;
	private String password;
	private String dob;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private String phone;
	private String highestDegree;
	private String yearOfPassing;
	private String marks;
	private String email;
	private String yearOfExperience;
	private String companyHistory;
	
	
	
	public Canditate() {
		// TODO Auto-generated constructor stub
	}



	public Canditate(String firstName, String lastName, String password, String dob, String address, String city,
			String state, String pincode, String phone, String highestDegree, String yearOfPassing, String marks,
			String email, String yearOfExperience, String companyHistory) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phone = phone;
		this.highestDegree = highestDegree;
		this.yearOfPassing = yearOfPassing;
		this.marks = marks;
		this.email = email;
		this.yearOfExperience = yearOfExperience;
		this.companyHistory = companyHistory;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getPincode() {
		return pincode;
	}



	public void setPincode(String pincode) {
		this.pincode = pincode;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getHighestDegree() {
		return highestDegree;
	}



	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}



	public String getYearOfPassing() {
		return yearOfPassing;
	}



	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}



	public String getMarks() {
		return marks;
	}



	public void setMarks(String marks) {
		this.marks = marks;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getYearOfExperience() {
		return yearOfExperience;
	}



	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}



	public String getCompanyHistory() {
		return companyHistory;
	}



	public void setCompanyHistory(String companyHistory) {
		this.companyHistory = companyHistory;
	}



	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", dob=" + dob
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", phone="
				+ phone + ", highestDegree=" + highestDegree + ", yearOfPassing=" + yearOfPassing + ", marks=" + marks
				+ ", email=" + email + ", yearOfExperience=" + yearOfExperience + ", companyHistory=" + companyHistory
				+ "]";
	}
	
	
}
