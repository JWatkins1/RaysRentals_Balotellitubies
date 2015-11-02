package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.BikesDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

@Service
@Transactional
public class BikesServiceImpl implements BikesService {

	@Autowired
	@Qualifier("BikesDAO")
	BikesDAO bikesDAO;

	public void saveBikes(String bikename, int manufacturerVersion, int cost,
			Date purchaseDate, String bikeType, int bikeSize, String status) {

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

	public List<BikesModel> retrieveAllBikes() {
		return bikesDAO.retrieveAllBikes();
	}

	public List<BikesModel> retrieveRentedBikes() {
		return bikesDAO.retrieveRentedBikes();
	}

	public BikesModel retrieveBikeById(Long id) {
		BikesModel bike = bikesDAO.retrieveBikeById(id);
		return bike;
	}

	public void update(BikesModel bike) {
		bikesDAO.update(bike);

	}

}
