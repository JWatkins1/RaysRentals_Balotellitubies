package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.RentalDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.RentalModel;

public class RentalServiceImpl implements RentalService{
	
	@Autowired
	@Qualifier("RentalDAO")
	RentalDAO rentalDAO;

	public void saveRental(int bikeId, int customerId, Date startDate, Date endDate, int costOfRental, Boolean customerPaid ) {
		
		//BikesModel bikes = new BikesModel();
		RentalModel rental = new RentalModel();
		rental.setStartDate(startDate);
		rental.setEnd_date(endDate);
		rental.setCustomerPaid(customerPaid);
		rental.setBikeReferenceNumber(bikeId);
		rental.setCustomerID(customerId);
		rental.setCostOfRental(costOfRental);
		//bikes.setStatus("Rented");
		rentalDAO.rentals(rental);
		
	}	
	
	@Override
	public List<BikesModel> retrieveAvailableBikes(){
		return rentalDAO.retrieveAvailableBikes();
	}
}