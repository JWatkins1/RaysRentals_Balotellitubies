package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.StockModel;

public interface StockService {

	public void saveStock(String itemname, int itemquantity, String itemdescription);

	public List<StockModel> retrieveAllStock();
}
