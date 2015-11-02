package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.StockModel;

public interface Stock {

	public void stock(StockModel stockModel);

	public List<StockModel> retrieveAllStock();

}
