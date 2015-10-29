package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.util.Date;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.DisposalDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.DisposalModel;

@Service
@Transactional
public class DisposalServiceImpl implements DisposalService {

	@Autowired
	@Qualifier("DisposalDAO")
	DisposalDAO disposalDAO;

	public void saveMaintenance() {

		DisposalModel disposal = new DisposalModel();
		disposal.setBikeId(2);
		;
		disposal.setDisposalDate(new Date());
		disposal.setDealer("Salford Bikes");
		disposal.setSellPrice(100);
		;
		disposalDAO.Disposal(disposal);
	}
}
