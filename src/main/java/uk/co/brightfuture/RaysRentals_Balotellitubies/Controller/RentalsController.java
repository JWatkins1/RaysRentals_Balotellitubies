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
	@Qualifier("CustomerServiceImpl")
	CustomerService customerService;

	@Autowired
	@Qualifier("BikesServiceImpl")
	BikesService bikesService;

	@RequestMapping("/rental")
	public ModelAndView rentABikePage() {
		ModelAndView mv = new ModelAndView();

		List<BikesModel> bike = rentalService.retrieveAvailableBikes();
		mv.addObject("bike", bike);
		mv.setViewName("RaysRentals/rentingabikeform");
		List<CustomerModel> customers = customerService.retrieveAllCustomers();
		mv.addObject("customers", customers);

		return mv;
	}

	@RequestMapping("/rental/submitrental")
	public ModelAndView rentABike(
			@RequestParam("Bike") Long bikeId,
			@RequestParam("CustomerId") Long customerId,
			@RequestParam("StartDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
			@RequestParam("EndDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
			@RequestParam("CostOfRental")Long costOfRental,
			@RequestParam(required = false, value = "CustomerPaid") Boolean customerPaid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/rentingabikeform");
		rentalService.saveRental(bikeId, customerId, startDate, endDate, costOfRental,
				customerPaid);
		List<BikesModel> bike = rentalService.retrieveAvailableBikes();
		mv.addObject("bike", bike);
		mv.setViewName("RaysRentals/rentingabikeform");
		List<CustomerModel> customers = customerService.retrieveAllCustomers();
		mv.addObject("customers", customers);

		return mv;

	}

	@RequestMapping("/listofrentals")
	public ModelAndView listOfRentalsPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/listofrentals");
		List<BikesModel> rentedBikes = bikesService.retrieveRentedBikes();
		mv.addObject("rentedBikes", rentedBikes);
		List<CustomerModel> customers = customerService.retrieveAllCustomers();
		mv.addObject("customers", customers);

		return mv;
	}

}
