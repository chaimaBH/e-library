package BasicServices;

import java.util.List;

import javax.ejb.Local;

import entities.Book;
import entities.Category;

@Local
public interface ManageCategoryLocal {
	Boolean AddCategory(Category cat);
	Boolean UpdateCategory(Category cat);
	Boolean DeleteCategory (Category cat);
	Category FindCategoryById(Integer id);
	//Boolean AssignBookToCategory(Integer id, Book book);
	List<Book>FindAllCategories();

}
