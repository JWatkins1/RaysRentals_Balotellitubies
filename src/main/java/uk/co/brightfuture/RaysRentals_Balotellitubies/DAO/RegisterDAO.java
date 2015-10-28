package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.UserModel;

public class RegisterDAO implements Register {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;
	
	public void saveUser(UserModel userModel) {
		Session session = sessionFactory.openSession();
		session.save(userModel);
	}

	@Override
	public void saveCustomer(CustomerModel customerModel) {
		Session session = sessionFactory.openSession();
		session.save(customerModel);
	}
}
