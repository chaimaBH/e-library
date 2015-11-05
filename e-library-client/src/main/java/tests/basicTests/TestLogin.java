package tests.basicTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Admin;
import entities.Subscriber;
import entities.User;
import BasicServices.ManageUserRemote;

public class TestLogin {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ManageUserRemote  proxy =(ManageUserRemote) context
				.lookup("/e-library-ejb/ManageUser!BasicServices.ManageUserRemote");
		User userLoggedIn = proxy.login("sub","sub");
		
		if (userLoggedIn instanceof Admin) {
			System.out.println("hello Mr : " + userLoggedIn.getName());
		}
		if (userLoggedIn instanceof Subscriber) {
			System.out.println("Hello : " + userLoggedIn.getName());
		}
		
	}

}
