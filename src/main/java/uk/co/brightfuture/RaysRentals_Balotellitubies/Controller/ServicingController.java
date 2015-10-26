package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.ServicingModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.ServicingService;

@Controller
@RequestMapping("/")
public class ServicingController {

	@Autowired
	@Qualifier("ServicingServiceImpl")
	ServicingService servicingService;

	@RequestMapping("/servicing")
	public ModelAndView Servicing() {

		ModelAndView mv = new ModelAndView("simpleforms/servicing");
		return mv;
	}

	@RequestMapping("/servicing/addservice")
	public ModelAndView addService(@RequestParam("BikeID") int bikeId,
			@RequestParam("TyresReplaced") Boolean tyresReplaced,
			@RequestParam("BikeLubrication") Boolean bikeLubrication,
			@RequestParam("BrakesReplaced") Boolean brakesReplaced,
			@RequestParam("CablesReplaced") Boolean cablesReplaced,
			@RequestParam("NextServiceDate") Date nextServiceDate) {

		ModelAndView mv = new ModelAndView("RaysRentals/addservice");
		servicingService.recordServicing(bikeId, tyresReplaced, bikeLubrication, brakesReplaced, cablesReplaced, nextServiceDate);
		return mv;
	}

	@RequestMapping("/servicing/servicereports")
	public ModelAndView servicingReports() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/servicereports");
		List<ServicingModel> servicing = servicingService.retrieveAllServiceReports();
		mv.addObject("servicing", servicing);

		return mv;
	}
}