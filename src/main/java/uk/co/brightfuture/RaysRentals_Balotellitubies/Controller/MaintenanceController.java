package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.MaintenanceService;

@Controller
@RequestMapping("/")
public class MaintenanceController {
	
	@Autowired
	@Qualifier("MaintenanceServiceImpl")
	MaintenanceService maintenanceService;

	@RequestMapping("/maintenance")
	public ModelAndView Maintenance() {

		maintenanceService.maintenanceRecord();
		ModelAndView mv = new ModelAndView("simpleforms/maintenance");
		return mv;
	}

}
