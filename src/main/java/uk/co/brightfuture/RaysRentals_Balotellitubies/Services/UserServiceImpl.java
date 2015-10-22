package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.UserDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.UserModel;

public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("UserDAO")
	UserDAO userDAO;
	
	public void saveUser(String email, String password, String firstName, String lastName){
		
		UserModel user = new UserModel();
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		userDAO.saveUser(user);
		
	}
}
