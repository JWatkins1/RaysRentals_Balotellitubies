package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.RentalModel;
@Repository(value = "rentalDAO")
public class RentalDAO implements Rental {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	@Override
	public void rentals(RentalModel rentals) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(rentals);
		
	}
	
	//TODO change open session to getCurrentSession once login is set up 
	@Override
	public List<BikesModel> retrieveAvailableBikes() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(BikesModel.class);
		criteria.add(Restrictions.eq("status", "Available"));
		List<BikesModel> bike = criteria.list();
		
		return bike;
	}
}
