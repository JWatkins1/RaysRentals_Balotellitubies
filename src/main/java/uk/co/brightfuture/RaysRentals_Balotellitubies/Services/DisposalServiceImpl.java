package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.DisposalDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.DisposalModel;


public class DisposalServiceImpl implements DisposalService{

	@Autowired
	@Qualifier("DisposalDAO")
	DisposalDAO disposalDAO;
	
	public void saveMaintenance(){
		
		DisposalModel disposal = new DisposalModel();
		disposal.setBikeId(2);;
		disposal.setDisposalDate(new LocalDateTime());
		disposal.setDealer("Salford Bikes");
		disposal.setSellPrice(100);;
		disposalDAO.Disposal(disposal);
	}		
}
