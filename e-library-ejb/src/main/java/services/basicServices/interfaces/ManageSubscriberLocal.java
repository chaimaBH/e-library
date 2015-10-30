package services.basicServices.interfaces;

import java.util.List;

import javax.ejb.Local;

import entities.Subscriber;

@Local
public interface ManageSubscriberLocal {
	Boolean AddSubscriber(Subscriber sub);
	Boolean UpdateSubscriber(Subscriber sub);
	Boolean DeleteSubscriber(Subscriber sub);
	Subscriber FindSubscriberById(Integer idSub);
	List< Subscriber> FindAllSubscriber();

}
