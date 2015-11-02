package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;

public interface RegisterService {
	
	public void saveUser(String email, String password, String firstName, String lastName);
	
	public void saveCustomer(String name, String email, Date joinDate, String address, String postCode, String phoneNumber);
}
