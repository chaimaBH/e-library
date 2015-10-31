package tests.basicTests;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import entities.Subscriber;
import BasicServices.ManageSubscriberRemote;

public class TestManageSubscriber {
	static	ManageSubscriberRemote remote;
	public static void doAddSubscriber(ManageSubscriberRemote remote){
		Subscriber sub = new Subscriber();
		sub.setFirstName("Ben HAssine");
		sub.setLastName("Chaima");
		if(remote.AddSubscriber(sub))
		{
			System.out.println("user added !!!! ");
		}
		else{
			System.out.println("erreur");
		}
		remote.AddSubscriber(sub);
		
	}

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

		remote=(ManageSubscriberRemote) context.lookup("/e-library-ejb/ManageSubscriber!BasicServices.ManageSubscriberRemote");
		doAddSubscriber(remote);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

	}


