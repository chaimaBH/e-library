package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Emprunt
 *
 */


public class Emprunt implements Serializable {

	private Date DateRetour;
	
private EmpruntPK empruntPk;

	private static final long serialVersionUID = 1L;

	public Emprunt() {
		super();
	}   
	public Date getDateRetour() {
		return this.DateRetour;
	}

	public void setDateRetour(Date DateRetour) {
		this.DateRetour = DateRetour;
	}
	@EmbeddedId
	public EmpruntPK getEmpruntPk() {
		return empruntPk;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((DateRetour == null) ? 0 : DateRetour.hashCode());
		result = prime * result
				+ ((empruntPk == null) ? 0 : empruntPk.hashCode());
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
		Emprunt other = (Emprunt) obj;
		if (DateRetour == null) {
			if (other.DateRetour != null)
				return false;
		} else if (!DateRetour.equals(other.DateRetour))
			return false;
		if (empruntPk == null) {
			if (other.empruntPk != null)
				return false;
		} else if (!empruntPk.equals(other.empruntPk))
			return false;
		return true;
	}
	public void setEmpruntPk(EmpruntPK empruntPk) {
		this.empruntPk = empruntPk;
	}
   
}
