package services.basicServices.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Subscriber;
import services.basicServices.interfaces.ManageSubscriberLocal;
import services.basicServices.interfaces.ManageSubscriberRemote;

/**
 * Session Bean implementation class ManageSubscriber
 */
@Stateless
public class ManageSubscriber implements ManageSubscriberRemote, ManageSubscriberLocal {

   @PersistenceContext(unitName="e-library-ejb")
   EntityManager entityManager;
   
   public ManageSubscriber() {
        // TODO Auto-generated constructor stub
    }


	public Boolean AddSubscriber(Subscriber sub) {
		try {
			entityManager.persist(sub);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	
	}


	public Boolean UpdateSubscriber(Subscriber sub) {
		try {
			entityManager.merge(sub);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}

	
	public Boolean DeleteSubscriber(Subscriber sub) {
		try {
			entityManager.remove(entityManager.merge(sub));
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	
	public Subscriber FindSubscriberById(Integer idSub) {
		Subscriber sub =null;
		try {
			sub=entityManager.find(Subscriber.class,idSub);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sub ;
				
	}
	
	public List<Subscriber> FindAllSubscriber() {
		Query query = entityManager.createQuery("select s Subscriber s");
		return query.getResultList();
	}

}
