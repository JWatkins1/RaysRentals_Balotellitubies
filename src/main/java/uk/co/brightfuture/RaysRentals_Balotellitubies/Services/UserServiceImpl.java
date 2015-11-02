package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.UsersDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.UserModel;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("UsersDAO")
	UsersDAO usersDAO;

	@Override
	public UserModel retrieveUserByEmail(String email) {
		UserModel user = new UserModel();

		user.setEmail(email);
		return usersDAO.retrieveUserByExample(user);
	}

}
