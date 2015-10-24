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

	private EmpruntPK EmpPK;

	private Date DateReturn;
	private static final long serialVersionUID = 1L;

	public Emprunt() {
		super();
	}   
	
	public Date getDateReturn() {
		return this.DateReturn;
	}

	public void setDateReturn(Date DateReturn) {
		this.DateReturn = DateReturn;
	}
	
	@EmbeddedId
	public EmpruntPK getEmpPK() {
		return EmpPK;
	}
	public void setEmpPK(EmpruntPK empPK) {
		EmpPK = empPK;
	}
	
   
}
