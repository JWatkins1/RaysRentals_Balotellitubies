package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.CustomerDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	@Qualifier("CustomerDAO")
	CustomerDAO customerDAO;
	
	public void saveCustomer() {
		CustomerModel customer = new CustomerModel();
		customer.setName("John");
		customer.setEmail("john@john.com");
		customer.setPassword("john");
		customer.setJoinDate(new LocalDateTime());
		customer.setAddress("1 Chap rd");
		customer.setPostCode("M1 1BV");
		customer.setPhoneNumber("07777777777");
		customer.setRentedBikes(5);
		customerDAO.saveCustomer(customer);
	}
}
