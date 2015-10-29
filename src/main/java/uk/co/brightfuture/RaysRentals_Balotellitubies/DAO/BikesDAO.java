package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;

@Repository(value = "bikesDAO")
public class BikesDAO implements Bikes {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;
	
	@Override
	public void bikes(BikesModel bikesModel) {

		Session session = sessionFactory.getCurrentSession();
		session.save(bikesModel);

	}

	@Override
	public List<BikesModel> retrieveAllBikes() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(BikesModel.class);
		List<BikesModel> bikes = criteria.list();
		return bikes;
	}

	@Override
	public List<BikesModel> retrieveRentedBikes() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(BikesModel.class);
		criteria.add(Restrictions.eq("status", "Rented"));
		List<BikesModel> bikes = criteria.list();

		return bikes;
	}

	/**
	 * gets a bike by its id
	 * 
	 * @param Long
	 *            id
	 * @return BikesModel
	 */
	@Override
	public BikesModel retrieveBikeById(Long bikeId) {
		return (BikesModel) sessionFactory.getCurrentSession().load(BikesModel.class,
				bikeId);
	}
	
	@Override
	public void update(BikesModel bike) {
		Session session = sessionFactory.getCurrentSession();
		session.update(bike);
		
	}
}
