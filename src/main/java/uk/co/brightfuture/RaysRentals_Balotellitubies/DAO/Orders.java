package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.OrdersModel;

public interface Orders {

	public void orders(OrdersModel ordersModel);
	
	public List<OrdersModel> retrieveAllOrdersReport();

}
