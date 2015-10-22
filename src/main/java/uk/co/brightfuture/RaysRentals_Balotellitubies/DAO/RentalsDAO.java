
package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.Rentals;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.RentalsModel;

public class RentalsDAO implements Rentals {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	@Override
	public void rentals(RentalsModel rentals) {
		
		Session session = sessionFactory.openSession();
		session.save(rentals);
		
	}


}