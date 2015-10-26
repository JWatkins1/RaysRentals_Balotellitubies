package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.MaintenanceDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.MaintenanceModel;

public class MaintenanceServiceImpl implements MaintenanceService {

	@Autowired
	@Qualifier("MaintenanceDAO")
	MaintenanceDAO maintenanceDAO;

	public void recordMaintenance(String damageDescription, int costOfRepair, Date repairDate, String repairSolution) {

		MaintenanceModel maintenance = new MaintenanceModel();
		maintenance.setDamageDescription(damageDescription);
		maintenance.setRepairCost(costOfRepair);
		maintenance.setRepairDate(repairDate);
		maintenance.setRepairSolution(repairSolution);
		maintenanceDAO.maintenance(maintenance);
	}

	public List<MaintenanceModel> retrieveAllMaintenanceReports() {
		return maintenanceDAO.retrieveAllMaintenanceReports();
	}
}
