package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.ServicingService;

@Controller
@RequestMapping("/")
public class ServicingController {
	
	@Autowired
	@Qualifier("ServicingServiceImpl")
	ServicingService servicingService;
	
	@RequestMapping("/servicing")
	public ModelAndView Servicing() {
		
		servicingService.saveServicing();
		ModelAndView mv = new ModelAndView("simpleforms/servicing");
		return mv;
	}
}
