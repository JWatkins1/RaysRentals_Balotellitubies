package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.BikesDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.RentalDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.RentalModel;

@Service
@Transactional
public class RentalServiceImpl implements RentalService {

	@Autowired
	@Qualifier("RentalDAO")
	RentalDAO rentalDAO;

	@Autowired
	BikesDAO bikesDAO;

	public long costOfRental;

	public void saveRental(Long bikeId, Long customerId, Date startDate,
			Date endDate, Long costOfRental, Boolean customerPaid) {
		RentalModel rental = new RentalModel();
		BikesModel bike = bikesDAO.retrieveBikeById(bikeId);
		rental.setStartDate(startDate);
		rental.setEnd_date(endDate);
		rental.setCostOfRental(costOfRental);
		rental.setCustomerPaid(customerPaid);
		rental.setBikeReferenceNumber(bikeId);
		rental.setCustomerID(customerId);

		rental.setCostOfRental(costOfRental);
		bike.setStatus("Rented");
		bikesDAO.update(bike);
		rentalDAO.rentals(rental);

	}

	public List<BikesModel> retrieveAvailableBikes() {
		return rentalDAO.retrieveAvailableBikes();
	}

}