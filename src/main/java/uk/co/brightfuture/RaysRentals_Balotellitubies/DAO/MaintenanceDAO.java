package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.MaintenanceModel;

public class MaintenanceDAO {
	
	
	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;
	
	public void maintenance(MaintenanceModel maintenanceModel) {
		
		Session session = sessionFactory.openSession();
		session.save(maintenanceModel);
		
	}
}
