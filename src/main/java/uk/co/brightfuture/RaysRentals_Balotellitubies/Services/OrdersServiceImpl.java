package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.OrdersDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.OrdersModel;

public class OrdersServiceImpl implements OrdersService {

	@Autowired
	@Qualifier("OrdersDAO")
	OrdersDAO ordersDAO;

	public void saveOrders(String itemname, int itemquantity, String itemdescription, double individualCost,
			double totalCost, Date purchaseDate) {

		OrdersModel orders = new OrdersModel();
		orders.setItemName(itemname);
		orders.setItemQuantity(itemquantity);
		orders.setItemDescription(itemdescription);
		orders.setIndivualCost(individualCost);
		orders.setTotalCost(totalCost);
		orders.setPurchaseDate(purchaseDate);
		ordersDAO.orders(orders);
	}

	public List<OrdersModel> retrieveAllOrders() {
		return ordersDAO.retrieveAllOrdersReport();
	}
}
