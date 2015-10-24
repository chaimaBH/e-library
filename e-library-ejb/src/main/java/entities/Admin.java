package entities;


import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User {

	
	private String Email;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
   
}
