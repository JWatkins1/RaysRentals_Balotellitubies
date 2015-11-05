package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.BikesModel;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;

@Repository(value = "customerDAO")
public class CustomerDAO implements Customer {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	public void saveCustomer(CustomerModel customerModel) {

		Session session = sessionFactory.openSession();
		session.save(customerModel);
	}
	
	@Override
	public List<CustomerModel> retrieveAllCustomers(){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(CustomerModel.class);
		@SuppressWarnings("unchecked")
		List<CustomerModel> customers = criteria.list();
		return customers;
	
	}

	@Override
	public CustomerModel getCustomerById(Long Id) {
		return (CustomerModel) sessionFactory.getCurrentSession().load(CustomerModel.class,
				Id);
	}

	@Override
	public void update(CustomerModel customer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);
		
	}


}
