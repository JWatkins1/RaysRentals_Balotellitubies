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
@Table(name = "Servicing")
public class ServicingModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6208866716064053651L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "bike_id")
	private int bikeId;

	@Column(name = "tyres_replaced")
	private Boolean tyresReplaced;

	@Column(name = "bike_lubrication")
	private Boolean bikeLubricaton;

	@Column(name = "brakes_replaced")
	private Boolean brakesReplaced;

	@Column(name = "cables_replaced")
	private Boolean cablesReplaced;

	@Column(name = "next_service_date")
	private Date nextServiceDate;

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public Boolean getTyresReplaced() {
		return tyresReplaced;
	}

	public void setTyresReplaced(Boolean tyresReplaced) {
		this.tyresReplaced = tyresReplaced;
	}

	public Boolean getBikeLubrication() {
		return bikeLubricaton;
	}

	public void setBikeLubrication(Boolean bikeLubrication) {
		this.bikeLubricaton = bikeLubrication;
	}

	public Boolean getBrakesReplaced() {
		return brakesReplaced;
	}

	public void setBrakesReplaced(Boolean brakesReplaced) {
		this.brakesReplaced = brakesReplaced;
	}

	public Boolean getCablesReplaced() {
		return cablesReplaced;
	}

	public void setCablesReplaced(Boolean cablesReplaced) {
		this.cablesReplaced = cablesReplaced;
	}

	public Date getNextServiceDate() {
		return nextServiceDate;
	}

	public void setNextServiceDate(Date nextServiceDate) {
		this.nextServiceDate = nextServiceDate;
	}
}
