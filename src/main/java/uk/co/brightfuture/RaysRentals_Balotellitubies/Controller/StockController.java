package uk.co.brightfuture.RaysRentals_Balotellitubies.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.OrdersModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.StockModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.OrdersService;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Services.StockService;

@Controller
@RequestMapping("/")
public class StockController {

	@Autowired
	@Qualifier("StockServiceImpl")
	StockService stockService;
	
	@Autowired
	@Qualifier("OrdersServiceImpl")
	OrdersService ordersService;

	@RequestMapping("/stock")
	public ModelAndView stock() {

		ModelAndView mv = new ModelAndView("RaysRentals/stock");
		return mv;

	}

	@RequestMapping("/stock/addstock")
	public ModelAndView addstock(@RequestParam("ItemName") String itemName,
			@RequestParam("ItemQuantity") int itemQuantity, 
			@RequestParam("ItemDescription") String itemDescription) {

		ModelAndView mv = new ModelAndView("RaysRentals/addstock");
		stockService.saveStock(itemName, itemQuantity, itemDescription);
		return mv;

	}

	@RequestMapping("/stock/stocklist")
	public ModelAndView stockList() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/stocklist");
		List<StockModel> stock = stockService.retrieveAllStock();
		mv.addObject("stock", stock);

		return mv;

	}

	@RequestMapping("/stock/orderslist")
	public ModelAndView ordersList() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("RaysRentals/orderslist");
		List<OrdersModel> orders = ordersService.retrieveAllOrders();
		mv.addObject("orders", orders);

		return mv;

	}

}
