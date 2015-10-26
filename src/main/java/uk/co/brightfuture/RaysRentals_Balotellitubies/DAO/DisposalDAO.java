package uk.co.brightfuture.RaysRentals_Balotellitubies.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.DisposalModel;

public class DisposalDAO implements Disposal {
	
	
	
	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;
	
	public void saveDisposal(DisposalModel disposal) {
		
		Session session = sessionFactory.openSession();
		session.save(disposal);
	}
	
	@Override
	public List<DisposalModel> retrieveDisposedBikes() {
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(DisposalModel.class);
		List<DisposalModel> disposal = criteria.list();
		
		return disposal;
	}

}
