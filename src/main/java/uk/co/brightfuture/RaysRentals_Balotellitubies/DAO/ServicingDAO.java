package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.ServicingModel;

public class ServicingDAO implements Servicing {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	public void servicing(ServicingModel servicingModel) {

		Session session = sessionFactory.openSession();
		session.save(servicingModel);
	}
	
	@Override
	public List<ServicingModel> retrieveAllServiceReports() {
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ServicingModel.class);
		List<ServicingModel> servicing = criteria.list();
		
		return servicing;
	}
}
