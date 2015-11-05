package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Session;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;

public interface Customer {

	public void saveCustomer(CustomerModel customerModel);
	
	public List<CustomerModel> retrieveAllCustomers();
	
	public CustomerModel getCustomerById(Long Id);

	public void update(CustomerModel customer);
}
