package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.StockDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.StockModel;

public class StockServiceImpl implements StockService {

	@Autowired
	@Qualifier("StockDAO")
	StockDAO stockDAO;

	public void saveStock(String itemname, int itemquantity, String itemdescription) {

		StockModel stocks = new StockModel();
		stocks.setItemName("cables");
		stocks.setItemQuantity(20);
		stocks.setItemDescription("Bikes cables");
		stockDAO.stock(stocks);
	}

	public List<StockModel> retrieveAllStock() {
		return stockDAO.retrieveAllStock();
	}
}
