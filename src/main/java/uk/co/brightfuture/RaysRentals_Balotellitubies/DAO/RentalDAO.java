package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.Rental;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.RentalModel;

public class RentalDAO implements Rental {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	@Override
	public void rentals(RentalModel rentals) {
		
		Session session = sessionFactory.openSession();
		session.save(rentals);
		
	}


}