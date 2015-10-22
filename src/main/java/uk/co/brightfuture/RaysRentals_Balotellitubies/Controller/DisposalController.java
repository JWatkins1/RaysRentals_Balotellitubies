package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.DisposalService;


@Controller
@RequestMapping("/")
public class DisposalController {
	
	@Autowired
	@Qualifier("DisposalServiceImpl")
	DisposalService disposalService;
	
	@RequestMapping("/disposal")
	public ModelAndView Disposal(){
		
		disposalService.saveMaintenance();
		ModelAndView mv = new ModelAndView("simpleforms/disposal");
		
		return mv;
		
	}
	
}
