package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

public interface BikesService {

	public void saveBikes(String bikename, int manufacturerVersion, int cost, Date purchaseDate, String bikeType,
			int bikeSize, String status);
	
	public List<BikesModel> retrieveAllBikes();

	public List<BikesModel> retrieveRentedBikes();

}
