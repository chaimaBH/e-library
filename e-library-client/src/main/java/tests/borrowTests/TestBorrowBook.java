package tests.borrowTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Emprunt;

import BorrowServices.BorrowBook;
import BorrowServices.BorrowBookRemote;

public class TestBorrowBook {
	
static	BorrowBookRemote remote;
public void doBorrowBook(BorrowBook remote)
	
{
Emprunt emp =new Emprunt();

    emp.setDateRetour(05/12/2015);
	
	if(remote.BorrowBookByUser(emp))
	{
		System.out.println("Book borrowed!!! ");
	}
	else{
		System.out.println("erreur");
	}
	remote.BorrowBookByUser(emp);
			
	}
	public static void main(String[] args) {
		try {
		Context context = new InitialContext();
			remote=(BorrowBookRemote)context.lookup("/e-library-ejb/BorrowBook!BorrowServices.BorrowBookRemote");
		
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	}


