package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.StockModel;

public class StockDAO implements Stock {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;
	
	public void stock(StockModel stockModel) {
		
		Session session = sessionFactory.openSession();
		session.save(stockModel);

	}
	
	@Override
	public List<StockModel> retrieveAllStock() {
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(StockModel.class);
		List<StockModel> stocks = criteria.list();
		return stocks;
	}
	
}
