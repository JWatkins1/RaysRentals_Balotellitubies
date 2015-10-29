package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.ServicingDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.ServicingModel;

@Service
@Transactional
public class ServicingServiceImpl implements ServicingService {

	@Autowired
	@Qualifier("ServicingDAO")
	ServicingDAO servicingDAO;

	public void saveServicing() {
		ServicingModel service = new ServicingModel();
		service.setBikeId(1);
		service.setTyresReplaced(true);
		service.setBikeLubrication(true);
		service.setBrakesReplaced(true);
		service.setCablesReplaced(true);
		service.setNextServiceDate(new Date(0));
		servicingDAO.saveServicing(service);
	}

}
