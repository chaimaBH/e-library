package entities;

import entities.User;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Subscriber
 *
 */
@Entity

public class Subscriber extends User implements Serializable {

	
	private String FirstName;
	private String LastName;
	private String PhoneNumber;
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
	public String getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}   
	public Date getDateSubscrib() {
		return this.DateSubscrib;
	}

	public void setDateSubscrib(Date DateSubscrib) {
		this.DateSubscrib = DateSubscrib;
	}
   
}
