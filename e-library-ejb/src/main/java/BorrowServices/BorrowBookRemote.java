package BorrowServices;

import java.util.Enumeration;

import javax.ejb.Remote;

import entities.Book;
import entities.Emprunt;


@Remote
public interface BorrowBookRemote {
	
Boolean BorrowBookByUser(Emprunt emp);


}
