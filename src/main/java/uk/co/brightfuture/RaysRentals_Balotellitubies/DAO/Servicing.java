package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.ServicingModel;

public interface Servicing {

	public void servicing(ServicingModel servicingModel);
	
	public List<ServicingModel> retrieveAllServiceReports();
}
