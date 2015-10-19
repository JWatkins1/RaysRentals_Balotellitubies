package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.BikesService;


@Controller
@RequestMapping("/")
public class BikesController
{
	
	@Autowired
	@Qualifier("BikesServiceImpl")
	BikesService bikesService;

	@RequestMapping("/bikes")
	public ModelAndView Bikes() {

		bikesService.saveBikes();
		ModelAndView mv = new ModelAndView("simpleforms/bikes");
		return mv;
	}
		
}
