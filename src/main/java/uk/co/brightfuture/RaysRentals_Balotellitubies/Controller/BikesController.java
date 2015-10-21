package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.BikesService;

@Controller
@RequestMapping("/")
public class BikesController {

	@Autowired
	@Qualifier("BikesServiceImpl")
	BikesService bikesService;

	@RequestMapping("/bikes")
	public String bikes() {

		// bikesDAO.bikes("Yolo");
		return "RaysRentals/bikes";

	}

	@RequestMapping("/bikes/addabike")
	public String addabike() {

		return "RaysRentals/addabike";

	}

	@RequestMapping("/bikes/listofbikes")
	public ModelAndView listofbikes() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/listofbikes");
		List<BikesModel> bike = bikesService.retrieveAllBikes();
		mv.addObject("bike", bike);

		return mv;
	}

}
