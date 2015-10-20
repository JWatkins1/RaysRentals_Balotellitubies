package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

public class BikesDAO implements Bikes {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;
	
	public void bikes(BikesModel bikesModel) {
		
		Session session = sessionFactory.openSession();
		session.save(bikesModel);
		
	}
}
