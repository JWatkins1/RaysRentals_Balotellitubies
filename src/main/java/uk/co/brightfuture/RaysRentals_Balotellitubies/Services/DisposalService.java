package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.DisposalModel;

public interface DisposalService {

	public void saveDisposal(int bikeID, String dealer, Date disposalDate, double sellPrice);
	
	public List<DisposalModel> retrieveDisposedBikes();
}
