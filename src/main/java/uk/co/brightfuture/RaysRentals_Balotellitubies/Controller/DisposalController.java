package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.DisposalModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.DisposalService;

@Controller
@RequestMapping("/")
public class DisposalController {

	@Autowired
	@Qualifier("DisposalServiceImpl")
	DisposalService disposalService;

	@RequestMapping("/disposal")
	public ModelAndView Disposal() {

		ModelAndView mv = new ModelAndView("RaysRentals/disposebike");

		return mv;

	}

	@RequestMapping("/disposal/disposebike")
	public ModelAndView disposebike(@RequestParam("BikeID") int bikeID, 
			@RequestParam("Dealer") String dealer,
			@RequestParam("DisposalDate") Date disposalDate, 
			@RequestParam("SellPrice") double sellPrice) {

		ModelAndView mv = new ModelAndView("RaysRentals/disposebike");
		disposalService.saveDisposal(bikeID, dealer, disposalDate, sellPrice);
		return mv;
	}
	
	@RequestMapping("/bikes/listofdisposals")
	public ModelAndView listofdisposals() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/listofdisposals");
		List<DisposalModel> disposal = disposalService.retrieveDisposedBikes();
		mv.addObject("disposal", disposal);

		return mv;
	}
}
