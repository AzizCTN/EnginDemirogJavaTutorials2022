package oop1;

public class IndividualCustomer extends Customer { //kişisel hesap girişi için özellikler
	private String firstName;
	private String lastName;
	
	public String getFirstNumber() {
		return firstName;
	}
	public void setFirstName(String firstNumber) {
		this.firstName = firstNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
