package BasicServices;

import java.util.List;

import entities.Subscriber;

public interface ManageSubscriberLocal {
	Boolean AddSubscriber(Subscriber sub);
	Boolean UpdateBook(Subscriber sub);
	Boolean DeleteBook (Subscriber sub);
	Subscriber FindSubscriberById(Integer idSub);
	List<Subscriber>FindAllBook();


}
