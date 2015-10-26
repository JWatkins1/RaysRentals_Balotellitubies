package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.MaintenanceModel;

public interface MaintenanceService {

	public void recordMaintenance(String damageDescription, int costOfRepair, Date repairDate, String repairSolution);

	public List<MaintenanceModel> retrieveAllMaintenanceReports();
}
