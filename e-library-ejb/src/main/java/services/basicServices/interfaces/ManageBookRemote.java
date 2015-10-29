package services.basicServices.interfaces;

import java.util.List;

import javax.ejb.Remote;



import entities.Book;

@Remote
public interface ManageBookRemote {
	Boolean AddBook(Book book);
	Boolean UpdateBook(Book book);
	Boolean Delete(Book book);
	Book FindBookById(Integer idBook);
	List< Book> FindAllBook();

}
