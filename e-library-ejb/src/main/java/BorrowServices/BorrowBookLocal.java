package BorrowServices;

import java.util.Enumeration;

import javax.ejb.Local;

import entities.Book;
import entities.Emprunt;

@Local
public interface BorrowBookLocal {
	Boolean BorrowBookByUser(Emprunt emp);



}
