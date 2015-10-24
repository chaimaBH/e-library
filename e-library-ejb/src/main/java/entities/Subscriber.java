package entities;


import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Subscriber
 *
 */
@Entity

public class Subscriber extends User {

	
	private String FirstName;
	private String LastName;
	private Integer PhoneNumber;
	private Date DateSubscrib;
	private static final long serialVersionUID = 1L;

	public Subscriber() {
		super();
	}   
	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}   
	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}   
	public Integer getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(Integer PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}   
	public Date getDateSubscrib() {
		return this.DateSubscrib;
	}

	public void setDateSubscrib(Date DateSubscrib) {
		this.DateSubscrib = DateSubscrib;
	}
   
}
