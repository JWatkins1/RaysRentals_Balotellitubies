package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

public interface Bikes {

	public void bikes(BikesModel bikesModel);

	public List<BikesModel> retrieveAllBikes();

	public List<BikesModel> retrieveRentedBikes();

}
