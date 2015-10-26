package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.BikesService;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.CustomerService;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.RentalService;

@Controller
@RequestMapping("/")
public class RentalsController {
	
	@Autowired
	@Qualifier("RentalServiceImpl")
	RentalService rentalService;
	
	@Autowired
	@Qualifier("BikesServiceImpl")
	BikesService bikesService;
	
	@RequestMapping("/rental")
	public ModelAndView rentABikePage(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/rentingabikeform");
		List<BikesModel> availableBike = rentalService.retrieveAvailableBikes();
		mv.addObject("availableBike", availableBike);
		
		//List<CustomerModel> customers = customerService.retrieveAllCustomers();
		//mv.addObject("customers", customers);
		
		
		return mv;
	}
	
	/*@RequestMapping("/rental/submitrental")
	public ModelAndView rentABike(@RequestParam("Bike")int bikeId, @RequestParam("CustomerId")int customerId, @RequestParam("StartDate")Date startDate, @RequestParam("EndDate")Date endDate, @RequestParam("CostOfRental")int costOfRental, @RequestParam("CustomerPaid")Boolean customerPaid){
		ModelAndView mv = new ModelAndView();
		rentalService.saveRental(bikeId,customerId, startDate, endDate, costOfRental, customerPaid);
		
		return mv;
		
	}*/
	
	@RequestMapping("/listofrentals")
	public ModelAndView listOfRentalsPage(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/listofrentals");
		List<BikesModel> rentedBikes = bikesService.retrieveRentedBikes();
		mv.addObject("rentedBikes", rentedBikes);
		//List<CustomerModel> customers = customerService.retrieveAllCustomers();
		//mv.addObject("customers", customers);
		
		
		return mv;
	}
	
	
}
	
	
