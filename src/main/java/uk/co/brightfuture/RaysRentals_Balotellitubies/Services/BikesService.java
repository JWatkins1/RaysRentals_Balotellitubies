package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

public interface BikesService {
	
	public void saveBikes();
	
	public List<BikesModel> retrieveAllBikes();
	
	
}
