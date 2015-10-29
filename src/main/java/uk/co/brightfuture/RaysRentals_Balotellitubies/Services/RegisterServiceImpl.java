package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.RegisterDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.UserModel;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	@Qualifier("RegisterDAO")
	RegisterDAO registerDAO;

	public void saveUser(String email, String password, String firstName,
			String lastName) {

		UserModel user = new UserModel();
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		registerDAO.saveUser(user);

	}

	public void saveCustomer(String name, String email, Date joinDate,
			String address, String postCode, String phoneNumber) {
		CustomerModel customer = new CustomerModel();
		customer.setName(name);
		customer.setEmail(email);
		customer.setJoinDate(joinDate);
		customer.setAddress(address);
		customer.setPostCode(postCode);
		customer.setPhoneNumber(phoneNumber);
		customer.setRentedBikes(0);
		registerDAO.saveCustomer(customer);

	}
}
