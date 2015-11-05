package BasicServices;

import java.util.List;

import javax.ejb.Remote;


import entities.Subscriber;

@Remote
public interface ManageSubscriberRemote {
	Boolean AddSubscriber(Subscriber sub);
	Boolean UpdateBook(Subscriber sub);
	Boolean DeleteBook (Subscriber sub);
	Subscriber FindSubscriberById(Integer idSub);
	List<Subscriber>FindAllBook();

}
