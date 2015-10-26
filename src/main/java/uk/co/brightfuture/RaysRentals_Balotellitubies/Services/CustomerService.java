package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;

public interface CustomerService {

	public void saveCustomer(String customerName, String customerEmail, String customerPassword, Date joinDate,
			String customerAddress, String customerPostcode, String customerNumber, int rentedBikes);
	
	public List<CustomerModel> retrieveAllCustomers();
}
