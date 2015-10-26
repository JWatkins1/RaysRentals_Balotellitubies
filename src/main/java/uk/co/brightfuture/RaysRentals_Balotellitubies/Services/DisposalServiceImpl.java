package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.DisposalDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.DisposalModel;

public class DisposalServiceImpl implements DisposalService {

	@Autowired
	@Qualifier("DisposalDAO")
	DisposalDAO disposalDAO;

	public void saveDisposal(int bikeID, String dealer, Date disposalDate, double sellPrice) {

		DisposalModel disposal = new DisposalModel();
		disposal.setBikeId(bikeID);
		disposal.setDealer(dealer);
		disposal.setDisposalDate(disposalDate);
		disposal.setSellPrice(sellPrice);
		disposalDAO.saveDisposal(disposal);
	}

	public List<DisposalModel> retrieveDisposedBikes() {
		return disposalDAO.retrieveDisposedBikes();
	}
}