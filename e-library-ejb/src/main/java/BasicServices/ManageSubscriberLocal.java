package BasicServices;

import java.util.List;

import javax.ejb.Local;

import entities.Subscriber;

@Local
public interface ManageSubscriberLocal {
	Boolean AddSubscriber(Subscriber sub);
	Boolean UpdateBook(Subscriber sub);
	Boolean DeleteBook (Subscriber sub);
	Subscriber FindSubscriberById(Integer idSub);
	List<Subscriber>FindAllBook();
}
