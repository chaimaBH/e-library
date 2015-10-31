package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmpruntPK
 *
 */

@Embeddable
public class EmpruntPK implements Serializable {

	
	private Integer idBook;
	private Integer idUser;
	private Date DateEmprunt;
	private static final long serialVersionUID = 1L;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((DateEmprunt == null) ? 0 : DateEmprunt.hashCode());
		result = prime * result + ((idBook == null) ? 0 : idBook.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpruntPK other = (EmpruntPK) obj;
		if (DateEmprunt == null) {
			if (other.DateEmprunt != null)
				return false;
		} else if (!DateEmprunt.equals(other.DateEmprunt))
			return false;
		if (idBook == null) {
			if (other.idBook != null)
				return false;
		} else if (!idBook.equals(other.idBook))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		return true;
	}
	public EmpruntPK() {
		super();
	}   
	public Integer getIdBook() {
		return this.idBook;
	}

	public void setIdBook(Integer idBook) {
		this.idBook = idBook;
	}   
	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}   
	public Date getDateEmprunt() {
		return this.DateEmprunt;
	}

	public void setDateEmprunt(Date DateEmprunt) {
		this.DateEmprunt = DateEmprunt;
	}
   
}
