package BasicServices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Book;
import entities.Category;


@Stateless
@LocalBean
public class ManageCategory implements ManageCategoryRemote, ManageCategoryLocal {
	@PersistenceContext
	EntityManager entityManager;
   
    public ManageCategory() {
        
    }

	@Override
	public Boolean AddCategory(Category cat) {
		try {
			entityManager.persist(cat);
			return true;

		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean UpdateCategory(Category cat) {
		try {
			entityManager.merge(cat);
			return true;

		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean DeleteCategory(Category cat) {
		try {
			entityManager.remove(entityManager.merge(cat));
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Category FindCategoryById(Integer id) {
		Category cat=null;
		try {
			cat= entityManager.find(Category.class, id);

		} catch (Exception e) {

		}
		return cat;
	}

	@Override
	public List<Book> FindAllCategories() {
		Query query = entityManager.createQuery("select c from Category b");
		return query.getResultList();
	}
	
	
}
