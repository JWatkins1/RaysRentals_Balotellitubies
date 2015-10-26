package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.RentalModel;

public interface Rental {
	
	
	public void rentals(RentalModel rentals);
	
	public List<BikesModel> retrieveAvailableBikes();
	
}