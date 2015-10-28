package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.UserModel;

public interface Register {

	public void saveUser(UserModel userModel);
	
	public void saveCustomer(CustomerModel customerModel);
	
}
