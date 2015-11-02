package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.OrdersModel;

public interface OrdersService {

	public void saveOrders(String itemname, int itemquantity, String itemdescription, double individualCost,
			double totalCost, Date purchaseDate);

	public List<OrdersModel> retrieveAllOrders();
}
