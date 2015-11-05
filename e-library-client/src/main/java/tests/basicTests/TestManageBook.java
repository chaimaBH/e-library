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
	book.setName("the davinci code");
	if(remote.AddBook(book))
	{
		System.out.println("Book added !!!! ");
	}
	else{
		System.out.println("erreur");
	}
	remote.AddBook(book);
	
}
public static void doDeleteBook(ManageBookRemote remote){
	Book book = new Book();
	book.setIdBook(6);
	if (remote.DeleteBook(book)) {
		System.out.println("book deleted");
	}
	else{
		System.out.println("erreur");
	}
	remote.DeleteBook(book);
}
public static void doUpadateBook(ManageBookRemote remote){
	Book book = new Book();
	book=remote.FindBookById(5);
	book.setName("med");
	if (remote.UpdateBook(book)) {
		System.out.println("book Updated");
	}
	else{
		System.out.println("erreur");
	}
	remote.UpdateBook(book);
}
	public static void main(String[] args) {
	try {
		Context context = new InitialContext();
		remote=(ManageBookRemote) context.lookup("/e-library-ejb/ManageBook!BasicServices.ManageBookRemote");
	//doAddbook(remote);	
	//doDeleteBook(remote);
		doUpadateBook(remote);
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
