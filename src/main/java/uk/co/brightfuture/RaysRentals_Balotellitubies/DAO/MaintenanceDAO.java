package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.MaintenanceModel;

public class MaintenanceDAO implements Maintenance {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	public void maintenance(MaintenanceModel maintenanceModel) {

		Session session = sessionFactory.openSession();
		session.save(maintenanceModel);
	}
	
	@Override
	public List<MaintenanceModel> retrieveAllMaintenanceReports() {
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(MaintenanceModel.class);
		List<MaintenanceModel> maintenance = criteria.list();
		
		return maintenance;
	}
}
