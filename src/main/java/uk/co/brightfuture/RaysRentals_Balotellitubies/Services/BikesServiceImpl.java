package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.BikesDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

public class BikesServiceImpl implements BikesService{
	
	@Autowired
	@Qualifier("BikesDAO")
	BikesDAO bikesDAO;
	
	public void saveBikes(String bikename, int manufacturerVersion, int cost, Date purchaseDate,String bikeType, 
			int bikeSize, String status){
		
		BikesModel bikes = new BikesModel();
		bikes.setName(bikename);
		bikes.setBikeType(bikeType);
		bikes.setCost(cost);
		bikes.setDate(purchaseDate);
		bikes.setManufacturerVersion(manufacturerVersion);
		bikes.setSize(bikeSize);
		bikes.setStatus(status);
		bikesDAO.bikes(bikes);
	}
	
}
