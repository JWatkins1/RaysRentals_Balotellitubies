package uk.co.brightfuture.RaysRentals_Balotellitubies;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BikesDAO implements Bikes {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;
	
	public void bikes() {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		BikesModel bikes = new BikesModel();
		bikes.setName("Abubakr");
		
		session.save(bikes);
		
	}
}
