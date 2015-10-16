package uk.co.brightfuture.RaysRentals_Balotellitubies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/simpleForms")
public class SimpleFormsController
{
	
	@Autowired
	@Qualifier("BikesDAO")
	private Bikes bikesDAO;

	@RequestMapping("/bikes")
	public ModelAndView Bikes() {
		
		//BikesDAO bikesDAO = new BikesDAO();
		bikesDAO.bikes("Abubakr");
		ModelAndView mv = new ModelAndView("simpleforms/bikes");
		return mv;
	}
		
	
}
