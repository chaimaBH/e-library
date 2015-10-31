package BasicServices;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Book;
import entities.Subscriber;

/**
 * Session Bean implementation class ManageSubscriber
 */
@Stateless
public class ManageSubscriber implements ManageSubscriberRemote, ManageSubscriberLocal {
	@PersistenceContext
	EntityManager entityManager;
    public ManageSubscriber() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean AddSubscriber(Subscriber sub) {
		try {
			entityManager.persist(sub);
			return true;

		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean UpdateBook(Subscriber sub) {
		try {
			entityManager.merge(sub);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean DeleteBook(Subscriber sub) {
		try {
			entityManager.remove(entityManager.merge(sub));
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Subscriber FindSubscriberById(Integer idSub) {
		Subscriber sub = null;
		try {
			sub = entityManager.find(Subscriber.class, idSub);

		} catch (Exception e) {

		}
		return sub;
	}

	@Override
	public List<Subscriber> FindAllBook() {
		Query query = entityManager.createQuery("select s from Subcriber s");
		return query.getResultList();
	}

}
