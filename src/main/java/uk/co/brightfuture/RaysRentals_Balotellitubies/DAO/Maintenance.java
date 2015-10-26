package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.MaintenanceModel;

public interface Maintenance {

	public void maintenance(MaintenanceModel maintenanceModel);
	
	public List<MaintenanceModel> retrieveAllMaintenanceReports();
}
