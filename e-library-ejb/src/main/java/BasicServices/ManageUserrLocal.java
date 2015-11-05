package BasicServices;

import java.util.List;

import javax.ejb.Local;

import entities.Subscriber;
import entities.User;

@Local
public interface ManageUserrLocal {
	Boolean AddUser(User user);
	Boolean UpdateUser(User user);
	Boolean DeleteBook (User user);
	User FindUserById(Integer idSub);
	User login(String loggin, String password);
	List<User>FindAllUser();

}
