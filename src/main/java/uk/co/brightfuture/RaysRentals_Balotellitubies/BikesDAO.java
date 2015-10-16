package uk.co.brightfuture.RaysRentals_Balotellitubies;

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
	
	public void bikes(String name) {
		
		Session session = sessionFactory.openSession();
		
		BikesModel bikes = new BikesModel();
		bikes.setName(name);
		bikes.setBikeType("BMX");
		bikes.setCost(200);
		bikes.setDate(new DateTime());
		bikes.setManufacturerVersion(1);
		bikes.setSize(15);
		bikes.setStatus("Available");
		
		session.save(bikes);
		
	}
}
