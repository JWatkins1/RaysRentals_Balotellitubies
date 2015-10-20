package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	@Qualifier("CustomerServiceImpl")
	CustomerService customerService;
	
	@RequestMapping("/customer")
	public ModelAndView Customer() {
		
		customerService.saveCustomer();
		ModelAndView mv = new ModelAndView("simpleforms/customer");
		return mv;
	}

}
