package uk.co.brightfuture.RaysRentals_Balotellitubies.Model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Rentals")
public class RentalModel implements Serializable {

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "rent_date")
	private Timestamp rent_date;
	
	@Column(name = "customer_id")
	private int customer_id;
	
	@Column(name = "bike_reference_number")
	private int bike_reference_number;
	
	@Column(name = "cost_of_rental")
	private Double cost_of_rental;
	
	@Column(name = "customer_paid")
	private Boolean customer_paid;
	
	
	
	public Timestamp getRentDate() {
		return rent_date;
	}

	public void setRentDate(Timestamp rentDate) {
		this.rent_date = rentDate;
	}

	public int getCustomerID() {
		return customer_id;
	}

	public void setCustomerID(int customer_id) {
		this.customer_id = customer_id;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getBikeReferenceNumber() {
		return bike_reference_number;
	}

	public void setBikeReferenceNumber(int bike_reference_number) {
		this.bike_reference_number = bike_reference_number;
	}

	public boolean getCustomerPaid() {
		return customer_paid;
	}

	public void setCustomerPaid(boolean customer_paid) {
		this.customer_paid = customer_paid;
	}
	
	public Double getCostOfRental() {
		return cost_of_rental;
	}

	public void setCostOfRental(double cost_of_rental) {
		this.cost_of_rental = cost_of_rental;
	}
	
	
}
