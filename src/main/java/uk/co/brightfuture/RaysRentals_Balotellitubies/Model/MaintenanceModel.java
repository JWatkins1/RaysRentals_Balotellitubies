package uk.co.brightfuture.RaysRentals_Balotellitubies.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maintenance")
public class MaintenanceModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "bike_id")
	private int bikeId;

	@Column(name = "description_of_damage")
	private String damageDescription;

	@Column(name = "repair_solution")
	private String repairSolution;

	@Column(name = "repair_date")
	private Date repairDate;

	@Column(name = "cost_of_repair")
	private int repairCost;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getDamageDescription() {
		return damageDescription;
	}

	public void setDamageDescription(String damageDescription) {
		this.damageDescription = damageDescription;
	}

	public String getRepairSolution() {
		return repairSolution;
	}

	public void setRepairSolution(String repairSolution) {
		this.repairSolution = repairSolution;
	}

	public Date getRepairDate() {
		return repairDate;
	}

	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}

	public int getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(int repairCost) {
		this.repairCost = repairCost;
	}

}
