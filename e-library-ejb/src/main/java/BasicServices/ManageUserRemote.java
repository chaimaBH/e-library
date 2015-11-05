package BasicServices;

import java.util.List;

import javax.ejb.Remote;



import entities.Subscriber;
import entities.User;

@Remote
public interface ManageUserRemote {
	Boolean AddUser(User user);
	Boolean UpdateUser(User user);
	Boolean DeleteBook (User user);
	User FindUserById(Integer idSub);
	User login(String loggin, String password);
	List<User>FindAllUser();

}
