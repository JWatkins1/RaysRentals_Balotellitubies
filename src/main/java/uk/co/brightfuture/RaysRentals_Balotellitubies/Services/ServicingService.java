package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.ServicingModel;

public interface ServicingService {

	public void recordServicing(int bikeId, Boolean tyresReplaced, Boolean bikeLubrication, Boolean brakesReplaced,
			Boolean cablesReplaced, Date nextServiceDate);
	
	public List<ServicingModel> retrieveAllServiceReports();
}
