package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;

public interface Customer {

	public void saveCustomer(CustomerModel customerModel);
	
	public List<CustomerModel> retrieveAllCustomers();
}
