package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.BikesDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

public class BikesServiceImpl implements BikesService{
	
	@Autowired
	@Qualifier("BikesDAO")
	BikesDAO bikesDAO;
	
	public void saveBikes(){
		
		BikesModel bikes = new BikesModel();
		bikes.setName("Yamaha");
		bikes.setBikeType("BMX");
		bikes.setCost(200);
		bikes.setDate(new LocalDateTime());
		bikes.setManufacturerVersion(1);
		bikes.setSize(15);
		bikes.setStatus("Available");
		bikesDAO.bikes(bikes);
	}		
}
