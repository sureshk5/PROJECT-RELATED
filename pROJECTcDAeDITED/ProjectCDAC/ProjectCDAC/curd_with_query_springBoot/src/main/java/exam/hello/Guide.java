package exam.hello;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Guide
{
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String addressProof;
	private String email;
	private String gender;
	public Guide()
	{
		
	}
	
	public Guide(String firstName, String lastName, String mobileNumber, String addressProof, String email,
			String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.addressProof = addressProof;
		this.email = email;
		this.gender = gender;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Guide [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", addressProof=" + addressProof + ", email=" + email + ", gender=" + gender + "]";
	}
}