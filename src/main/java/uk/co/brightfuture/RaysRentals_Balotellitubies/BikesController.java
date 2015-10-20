
package uk.co.brightfuture.RaysRentals_Balotellitubies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.BikesDAO;


@Controller
@RequestMapping("/")
public class BikesController {

	@Autowired
	@Qualifier("BikesDAO")
	BikesDAO bikesDAO;
	
	@RequestMapping("/bikes")
	public String bikes() {
		
		//bikesDAO.bikes("Yolo");
		return "RaysRentals/bikes";
	
	}
	
	@RequestMapping("/bikes/addabike")
	public String addabike() {
		
		return "RaysRentals/addabike";
	
	}
	
	@RequestMapping("/bikes/listofbikes")
	public String listofbikes() {
		
		return "RaysRentals/listofbikes";
	
	}
	
	
}
