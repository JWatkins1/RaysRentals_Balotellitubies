package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.MaintenanceModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.MaintenanceService;

@Controller
@RequestMapping("/")
public class MaintenanceController {

	@Autowired
	@Qualifier("MaintenanceServiceImpl")
	MaintenanceService maintenanceService;

	@RequestMapping("/maintenance")
	public ModelAndView Maintenance() {

		ModelAndView mv = new ModelAndView("simpleforms/maintenance");
		return mv;
	}

	@RequestMapping("/maintenance/addmaintenance")
	public ModelAndView addmaintenance(@RequestParam("BikeID") int bikeId,
			@RequestParam("DescriptionOfDamage") String damageDescription,
			@RequestParam("RepairSolution") String repairSolution, 
			@RequestParam("RepairDate") Date repairDate,
			@RequestParam("CostOfRepair") int costOfRepair) {

		ModelAndView mv = new ModelAndView("RaysRentals/addmaintenance");
		maintenanceService.recordMaintenance(damageDescription, costOfRepair, repairDate, repairSolution);
		return mv;
	}

	@RequestMapping("/maintenance/maintenancereports")
	public ModelAndView maintenanceReports() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/maintenancereports");
		List<MaintenanceModel> maintenance = maintenanceService.retrieveAllMaintenanceReports();
		mv.addObject("maintenance", maintenance);

		return mv;
	}

}
