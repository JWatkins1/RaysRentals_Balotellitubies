package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.ServicingDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.ServicingModel;

public class ServicingServiceImpl implements ServicingService {

	@Autowired
	@Qualifier("ServicingDAO")
	ServicingDAO servicingDAO;

	public void recordServicing(int bikeID, Boolean tyresReplaced, Boolean bikeLubrication, Boolean brakesReplaced,
			Boolean cablesReplaced, Date nextServiceDate) {

		ServicingModel servicing = new ServicingModel();
		servicing.setBikeId(bikeID);
		servicing.setTyresReplaced(tyresReplaced);
		servicing.setBikeLubrication(bikeLubrication);
		servicing.setBrakesReplaced(brakesReplaced);
		servicing.setCablesReplaced(cablesReplaced);
		servicing.setNextServiceDate(nextServiceDate);
		servicingDAO.servicing(servicing);
	}

	public List<ServicingModel> retrieveAllServiceReports() {
		return servicingDAO.retrieveAllServiceReports();
	}
}
