package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView bikes() {

		ModelAndView mv = new ModelAndView("RaysRentals/addabike");
		return mv;

	}

	@RequestMapping("/bikes/addabike")
	public ModelAndView addabike(@RequestParam("BikeName") String bikename, @RequestParam("ManufacturerVersion") int manufacturerVersion,
			@RequestParam("CostOfBike") int cost, @RequestParam("PurchaseDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date purchaseDate, @RequestParam("BikeType") String bikeType, 
			@RequestParam("BikeSize") int bikeSize, @RequestParam("Status") String status ) {
		
		
		ModelAndView mv = new ModelAndView("RaysRentals/addabike");
		bikesService.saveBikes(bikename, manufacturerVersion, cost, purchaseDate, bikeType, bikeSize, status);
		return mv;

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
