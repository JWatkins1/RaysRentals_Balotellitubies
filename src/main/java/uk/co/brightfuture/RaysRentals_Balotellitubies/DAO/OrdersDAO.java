package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.OrdersModel;

public class OrdersDAO implements Orders {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	public void orders(OrdersModel ordersModel) {

		Session session = sessionFactory.openSession();
		session.save(ordersModel);
	}
	
	@Override
	public List<OrdersModel> retrieveAllOrdersReport() {
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(OrdersModel.class);
		List<OrdersModel> orders = criteria.list();
		
		return orders;
	}

}
