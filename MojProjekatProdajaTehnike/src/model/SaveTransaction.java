package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaveTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTransaction;
	private int idBuyer;
	private int idSeller;
	private int idCar;
	private Date date;
	
	
	public int getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}
	public int getIdBuyer() {
		return idBuyer;
	}
	public void setIdBuyer(int idBuyer) {
		this.idBuyer = idBuyer;
	}
	public int getIdSeller() {
		return idSeller;
	}
	public void setIdSeller(int idSeller) {
		this.idSeller = idSeller;
	}
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
		
}	
		
	


