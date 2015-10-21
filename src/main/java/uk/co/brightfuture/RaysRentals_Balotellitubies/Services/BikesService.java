package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;


public interface BikesService {
	
	public void saveBikes(String bikename, int manufacturerVersion, int cost, Date purchaseDate,String bikeType, 
			int bikeSize, String status);
	
	
}
