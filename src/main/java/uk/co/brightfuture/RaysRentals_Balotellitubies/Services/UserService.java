package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.UserModel;

public interface UserService {
	public UserModel retrieveUserByEmail(String email);
}
