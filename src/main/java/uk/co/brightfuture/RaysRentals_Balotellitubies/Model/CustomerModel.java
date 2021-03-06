package uk.co.brightfuture.RaysRentals_Balotellitubies.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Customer")
public class CustomerModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6208866716064053651L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "date_joined")
	private Date joinDate;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "post_code")
	private String postCode;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "number_of_rented_bikes")
	private int rentedBikes;
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getRentedBikes() {
		return rentedBikes;
	}
	
	public void setRentedBikes(int numberOfRentedBikes) {
		this.rentedBikes = numberOfRentedBikes;
	}
}
