package uk.co.brightfuture.RaysRentals_Balotellitubies.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;


@Entity
@Table(name ="disposal")
public class DisposalModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "date_of_disposal")
	private Date disposalDate;
	
	@Column(name = "bike_id")
	private int bikeId;
	
	@Column(name = "dealer")
	private String dealer;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getDisposalDate() {
		return disposalDate;
	}

	public void setDisposalDate(java.util.Date date) {
		this.disposalDate = date;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getDealer() {
		return dealer;
	}

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	@Column(name = "sell_price")
	private int sellPrice;

}
