package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.UserModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.UserService;

@Controller
@RequestMapping("/")
public class LogInController {
	
	@Qualifier("UserServiceImpl")
	@Autowired
	UserService usersService;

	@RequestMapping(value = "/LogInRequest", method = RequestMethod.POST)
	public ModelAndView logInRequest(@RequestParam("Email") String email,
			@RequestParam("Password") String password, HttpSession session) {
		UserModel user;
		
		ModelAndView mv = new ModelAndView("/");
		
		try {
			System.out.println("From: " + email);
			user = usersService.retrieveUserByEmail(email);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
			return mv;
		}

		return mv;
	}

}
