package BasicServices;

import java.util.List;

import javax.ejb.Local;

import entities.Book;

@Local
public interface ManageBookLocal {
	Boolean AddBook(Book book);
	Boolean UpdateBook(Book book);
	Boolean DeleteBook (Book book);
	Book FindBookById(Integer idBook);
	List<Book>FindAllBook();

}
