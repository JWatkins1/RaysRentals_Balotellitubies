package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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

	@Override
	public List<BikesModel> retrieveAllBikes() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(BikesModel.class);
		List<BikesModel> bikes = criteria.list();
		return bikes;
	}

	@Override
	public List<BikesModel> retrieveRentedBikes() {
		Session session = sessionFactory.openSession();
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
	public BikesModel retrieveBikeById(Long id) {
		return (BikesModel) sessionFactory.openSession().load(BikesModel.class,
				id);
	}
}
