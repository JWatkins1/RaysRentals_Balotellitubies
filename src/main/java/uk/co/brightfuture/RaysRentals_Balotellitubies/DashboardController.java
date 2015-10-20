package uk.co.brightfuture.RaysRentals_Balotellitubies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DashboardController
{
	
	@RequestMapping("/dashboard")
	public ModelAndView Bikes() {
		
		ModelAndView mv = new ModelAndView("RaysRentals/dashboard");
		return mv;
	}
		
	
}
