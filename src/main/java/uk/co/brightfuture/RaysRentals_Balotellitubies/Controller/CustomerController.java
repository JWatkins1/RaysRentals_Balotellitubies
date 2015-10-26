package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerController {

	@Autowired
	@Qualifier("CustomerServiceImpl")
	CustomerService customerService;

	@RequestMapping("/customer")
	public ModelAndView Customer() {

		ModelAndView mv = new ModelAndView("simpleforms/customer");
		return mv;
	}

	@RequestMapping("/customer/addcustomer")
	public ModelAndView addCustomer(@RequestParam("Name") String customerName,
			@RequestParam("Email") String customerEmail, @RequestParam("Password") String customerPassword,
			@RequestParam("DateJoined") Date joinDate, @RequestParam("Address") String customerAddress,
			@RequestParam("Postcode") String customerPostcode, @RequestParam("PhoneNumber") String customerNumber,
			@RequestParam("NumberOfRentedBikes") int rentedBikes) {

		ModelAndView mv = new ModelAndView("RaysRentals/addcustomer");
		customerService.saveCustomer(customerName, customerEmail, customerPassword, joinDate, customerAddress,
				customerPostcode, customerNumber, rentedBikes);
		return mv;
	}

	@RequestMapping("customer/listcustomers")
	public ModelAndView listCustomers() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/listcustomers");
		List<CustomerModel> customer = customerService.retrieveAllCustomers();
		mv.addObject("customer", customer);

		return mv;
	}
}