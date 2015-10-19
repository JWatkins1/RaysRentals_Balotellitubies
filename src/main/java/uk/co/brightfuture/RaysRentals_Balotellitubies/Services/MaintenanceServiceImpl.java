package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.MaintenanceDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.MaintenanceModel;

public class MaintenanceServiceImpl {
	
	
	@Autowired
	@Qualifier("MaintenanceDAO")
	MaintenanceDAO maintenanceDAO;
	
public void maintenanceRecord(){
		
		MaintenanceModel maintenance = new MaintenanceModel();
		maintenance.setDamageDescription("sfw");
		maintenance.setRepairCost(100);
		maintenance.setRepairDate(new LocalDateTime());
		maintenance.setRepairSolution("sdgea");
		maintenanceDAO.maintenance(maintenance);
	}	
}
