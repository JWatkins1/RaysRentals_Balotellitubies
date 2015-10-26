package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.DisposalModel;

public interface Disposal {

	public void saveDisposal(DisposalModel disposalModel);
	
	public List<DisposalModel> retrieveDisposedBikes();
}
