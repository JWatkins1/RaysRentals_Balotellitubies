package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;

public interface CustomerService {
	
	public void saveCustomer();
	
	public List<CustomerModel> retrieveAllCustomers();

}
