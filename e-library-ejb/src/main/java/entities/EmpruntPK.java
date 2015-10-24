package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable
public class EmpruntPK   implements Serializable{
	private Integer IdUser;
	 private Integer IdBook;
	 private Date DateEmprunt;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((DateEmprunt == null) ? 0 : DateEmprunt.hashCode());
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
		return true;
	}

	public Integer getIdUser() {
		return IdUser;
	}
	public void setIdUser(Integer idUser) {
		IdUser = idUser;
	}
	public Integer getIdBook() {
		return IdBook;
	}
	public void setIdBook(Integer idBook) {
		IdBook = idBook;
	}
	public Date getDateEmprunt() {
		return DateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		DateEmprunt = dateEmprunt;
	}

}
