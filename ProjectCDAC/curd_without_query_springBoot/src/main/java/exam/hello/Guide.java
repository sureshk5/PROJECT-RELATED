
package exam.hello;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Guideregister")
public class Guide
{
	private String firstName;
	private String lastName;
	private String contact_number;
	@Id
	private String addressProof;
	private String gmail;
	private String gender;
	public Guide()
	{
		
	}
	
	public Guide(String firstName, String lastName, String contact_number, String addressProof, String gmail,
			String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact_number = contact_number;
		this.addressProof = addressProof;
		this.gmail = gmail;
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
	public String getcontact_number() {
		return contact_number;
	}
	public void setcontact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	public String getgmail() {
		return gmail;
	}
	public void setgmail(String gmail) {
		this.gmail = gmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Guide [firstName=" + firstName + ", lastName=" + lastName + ", contact_number=" + contact_number
				+ ", addressProof=" + addressProof + ", gmail=" + gmail + ", gender=" + gender + "]";
	}
}