package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.UserModel;

public class UsersDAO implements Users {
	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	@Override
	public UserModel retrieveUserByExample(UserModel user) {
		Criteria createCriteria = sessionFactory.getCurrentSession()
				.createCriteria(user.getClass());
		UserModel u = (UserModel) createCriteria.add(Example.create(user)).list()
				.get(0);
		return u;
	}

}
