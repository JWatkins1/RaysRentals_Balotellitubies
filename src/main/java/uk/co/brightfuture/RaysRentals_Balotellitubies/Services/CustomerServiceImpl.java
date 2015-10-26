package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.CustomerDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	@Qualifier("CustomerDAO")
	CustomerDAO customerDAO;

	public void saveCustomer(String customerName, String customerEmail, String customerPassword, Date joinDate,
			String customerAddress, String customerPostcode, String customerNumber, int rentedBikes) {

		CustomerModel customer = new CustomerModel();
		customer.setName(customerName);
		customer.setEmail(customerEmail);
		customer.setPassword(customerPassword);
		customer.setJoinDate(joinDate);
		customer.setAddress(customerAddress);
		customer.setPostCode(customerPostcode);
		customer.setPhoneNumber(customerNumber);
		customer.setRentedBikes(rentedBikes);
		customerDAO.saveCustomer(customer);
	}
	
	public List<CustomerModel> retrieveAllCustomers() {
		return customerDAO.retrieveAllCustomers();
	}
}
