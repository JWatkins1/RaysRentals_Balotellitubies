package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.RentalDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.RentalModel;

public class RentalServiceImpl implements RentalService{
	
	@Autowired
	@Qualifier("RentalsDAO")
	RentalDAO rentalDAO;

	@Override
	public void saveRental() {
		
		//wasn't sure what to do here with the timestamp
		
//		Date date = new Date();
//		Timestamp timestamp = new Timestamp(date.getTime());

		RentalModel rental = new RentalModel();
//		rental.setRentDate(timestamp);
		rental.setCustomerPaid(true);
		rental.getBikeReferenceNumber();
		rental.setCostOfRental(20);
		rentalDAO.rentals(rental);
		
	}		
}