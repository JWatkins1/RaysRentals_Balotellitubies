package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.ServicingModel;

public class ServicingDAO implements Servicing {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	public void saveServicing(ServicingModel servicingModel) {

		Session session = sessionFactory.openSession();
		session.save(servicingModel);
	}
}
