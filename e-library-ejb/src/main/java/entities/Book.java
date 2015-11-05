package entities;

import java.io.Serializable;
import java.util.Enumeration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Book
 *
 */
@Entity
public class Book implements Serializable {

	private Integer idBook;
	private String Name;
	private Category category;
	private Enumeration<Book> State;
	private static final long serialVersionUID = 1L;

	public Book() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdBook() {
		return this.idBook;
	}

	public void setIdBook(Integer idBook) {
		this.idBook = idBook;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	@ManyToOne
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Enumeration<Book> getState() {
		return State;
	}

	public void setState(Enumeration<Book> state) {
		State = state;
	}

}
