package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {

	@Autowired
	@Qualifier("RegisterServiceImpl")
	RegisterService registerService;

	@RequestMapping("/register")
	public ModelAndView registerUserPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/registerUser");

		return mv;
	}

	@RequestMapping("/register/saveUser")
	public ModelAndView saveNewUser(@RequestParam("Email") String email,
			@RequestParam("Password") String password,
			@RequestParam("firstName") String firstname,
			@RequestParam("lastName") String lastname) {

		ModelAndView mv = new ModelAndView();
		registerService.saveUser(email, password, firstname, lastname);

		mv.setViewName("RaysRentals/registerUser");
		return mv;
	}

	@RequestMapping("/newCustomer")
	public ModelAndView registerCustomerPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/registerCustomer");
		return mv;

	}

	@RequestMapping("/newCustomer/saveCustomer")
	public ModelAndView saveNewCustomer(@RequestParam("Name") String name,
			@RequestParam("Email") String email,
			@RequestParam("JoinDate") Date joinDate,
			@RequestParam("Address") String address,
			@RequestParam("PostCode") String postCode,
			@RequestParam("PhoneNum") String phoneNumber) {

		ModelAndView mv = new ModelAndView();
		registerService.saveCustomer(name, email, joinDate, address, postCode,
				phoneNumber);
		mv.setViewName("RaysRentals/registerCustomer");
		return mv;

	}
}
