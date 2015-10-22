package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.UserService;

@Controller
@RequestMapping("/")
public class RegisterController {

	@Autowired
	@Qualifier("UserServiceImpl")
	UserService userService;

	@RequestMapping("/register")
	public ModelAndView registerPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/register");

		return mv;
	}

	@RequestMapping("/register/saveUser")
	public ModelAndView saveNewUser(@RequestParam("Email")String email, @RequestParam("Password")String password, @RequestParam("firstName") String firstname, @RequestParam("lastName")String lastname){
		
		ModelAndView mv = new ModelAndView();
		userService.saveUser(email, password, firstname, lastname);
		
		mv.setViewName("RaysRentals/register");
		return mv;
	}
}
