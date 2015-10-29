package services.basicServices.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Book;
import services.basicServices.interfaces.ManageBookLocal;
import services.basicServices.interfaces.ManageBookRemote;

/**
 * Session Bean implementation class ManageBook
 */
@Stateless
public class ManageBook implements ManageBookRemote, ManageBookLocal {
@PersistenceContext(unitName="e-library-ejb")
    EntityManager entityManager;
    public ManageBook() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean AddBook(Book book) {
		try {
			entityManager.persist(book);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean UpdateBook(Book book) {
		try {
			entityManager.merge(book);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean Delete(Book book) {
		try {
			entityManager.remove(entityManager.merge(book));
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Book FindBookById(Integer idBook) {
		Book book= null;
		try {
			book=entityManager.find(Book.class,idBook);
			
			
		} catch (Exception e) {
			
		}
		return book;
	}

	@Override
	public List<Book> FindAllBook() {
		Query query = entityManager.createQuery("select b from Book b");
		return query.getResultList();
	}

}
