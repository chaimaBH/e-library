package BasicServices;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Book;
import entities.Subscriber;
import entities.User;

/**
 * Session Bean implementation class ManageSubscriber
 */
@Stateless
public class ManageUser implements ManageUserRemote, ManageUserrLocal {
	@PersistenceContext
	EntityManager entityManager;
    public ManageUser() {
        // TODO Auto-generated constructor stub
    }


	@Override
	public Boolean AddUser(User user) {
		try {
			entityManager.persist(user);
			return true;

		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean UpdateUser(User user) {
		try {
			entityManager.merge(user);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean DeleteBook(User user) {
		try {
			entityManager.remove(entityManager.merge(user));
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public User FindUserById(Integer id) {
		User user = null;
		try {
			user = entityManager.find(User.class, id);

		} catch (Exception e) {

		}
		return user;
	}

	@Override
	public List<User> FindAllUser() {
		Query query = entityManager.createQuery("select u from User u");
		return query.getResultList();
	}


	@Override
	public User login(String loggin, String password) {
		String jpql = "select u from User u where u.loggin =:param1 and u.password=:param2";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1", loggin);
		query.setParameter("param2", password);
		User user = null;
		try {
			user = (User) query.getSingleResult();
		} catch (Exception e) {
			System.err.println("Please check again !!");
		}
		return user;
	}

}
