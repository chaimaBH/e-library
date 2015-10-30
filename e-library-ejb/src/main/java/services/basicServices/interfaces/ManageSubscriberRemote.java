package services.basicServices.interfaces;

import java.util.List;

import javax.ejb.Remote;


import entities.Subscriber;

@Remote
public interface ManageSubscriberRemote {

	Boolean AddSubscriber(Subscriber sub);
	Boolean UpdateSubscriber(Subscriber sub);
	Boolean DeleteSubscriber(Subscriber sub);
	Subscriber FindSubscriberById(Integer idSub);
	List< Subscriber> FindAllSubscriber();
}
