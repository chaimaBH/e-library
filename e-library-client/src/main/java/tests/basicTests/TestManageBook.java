package tests.basicTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Book;
import BasicServices.ManageBookRemote;

public class TestManageBook {
static	ManageBookRemote remote;
public static void doAddBook(ManageBookRemote remote){
	Book book = new Book();
	book.setName("thedavincicode");
	if(remote.AddBook(book))
	{
		System.out.println("Book added !!!! :*");
	}
	else{
		System.out.println("erreur");
	}
	remote.AddBook(book);
}
	public static void main(String[] args) {
	try {
		Context context = new InitialContext();
		remote=(ManageBookRemote) context.lookup("/e-library-ejb/ManageBook!BasicServices.ManageBookRemote");
		doAddBook(remote);
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
