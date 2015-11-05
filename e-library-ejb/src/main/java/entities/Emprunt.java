package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Emprunt
 *
 */

@Entity
public class Emprunt implements Serializable {

	
	private int DateEmprunt;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DateEmprunt;
		result = prime * result + DateRetour;
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
		if (DateEmprunt != other.DateEmprunt)
			return false;
		if (DateRetour != other.DateRetour)
			return false;
		if (empruntPk == null) {
			if (other.empruntPk != null)
				return false;
		} else if (!empruntPk.equals(other.empruntPk))
			return false;
		return true;
	}

	private int  DateRetour;
	


private EmpruntPK empruntPk;

	private static final long serialVersionUID = 1L;

	public Emprunt() {
		super();
	}   
	
	@EmbeddedId
	public EmpruntPK getEmpruntPk() {
		return empruntPk;
	}

	public int getDateRetour() {
		return DateRetour;
	}

	public void setDateRetour(int dateRetour) {
		DateRetour = dateRetour;
	}

	public int getDateEmprunt() {
		return DateEmprunt;
	}

	public void setDateEmprunt(int dateEmprunt) {
		DateEmprunt = dateEmprunt;
	}
	
	
   
}
