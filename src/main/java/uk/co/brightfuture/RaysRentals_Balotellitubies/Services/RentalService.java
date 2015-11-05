package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

public interface RentalService {

		public void saveRental(Long bikeId, Long customerId, Date startDate, Date endDate, Long costOfRental, Boolean customerPaid);
		
		public List<BikesModel> retrieveAvailableBikes();
}
