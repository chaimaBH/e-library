package BorrowServices;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Emprunt;

/**
 * Session Bean implementation class BorrowBook
 */
@Stateless
public class BorrowBook implements BorrowBookRemote, BorrowBookLocal {
@PersistenceContext
EntityManager entitymanager;
    public BorrowBook() {
        // TODO Auto-generated constructor stub
    }

	public Boolean BorrowBookByUser(Emprunt emp) {
		try {
			entitymanager.persist(emp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
