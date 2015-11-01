package tests.basicTests;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Admin;
import entities.Subscriber;
import entities.User;
import BasicServices.ManageUserRemote;

public class TestManageUser {
	static	ManageUserRemote remote;
	public static void doAddUser(ManageUserRemote remote){
		Subscriber sub= new Subscriber();
		sub.setName("Ben HAssine");
		sub.setLoggin("sub");
		sub.setPassword("sub");
		Admin admin = new Admin();
		admin.setName("Admin_Oueslati_Med2");
		admin.setLoggin("f");
		admin.setPassword("f");
		if(remote.AddUser(admin)&&(remote.AddUser(sub)))
		{
			System.out.println("admin added !!!! ");
			//System.out.println("Subscriber added !!!! ");
		}
		else{
			System.out.println("erreur");
		}
		remote.AddUser(admin);
		//remote.AddUser(sub);
		
	}

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

		remote=(ManageUserRemote) context.lookup("/e-library-ejb/ManageUser!BasicServices.ManageUserRemote");
		doAddUser(remote);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

	}


