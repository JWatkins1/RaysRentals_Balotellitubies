package uk.co.brightfuture.RaysRentals_Balotellitubies.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bikes")
public class BikesModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6208866716064053651L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "manufacturer_version")
	private int manufacturerVersion;
	
	@Column(name = "purchase_date")
	private Date date;
	
	@Column(name = "cost_of_bike")
	private int cost;
	
	@Column(name = "bike_type")
	private String bikeType;
	
	@Column(name = "size")
	private int size;
	
	@Column(name = "status")
	private String status;
	
	public int getManufacturerVersion() {
		return manufacturerVersion;
	}

	public void setManufacturerVersion(int manufacturerVersion) {
		this.manufacturerVersion = manufacturerVersion;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date purchaseDate) {
		this.date = purchaseDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
