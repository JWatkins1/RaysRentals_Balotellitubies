package uk.co.brightfuture.RaysRentals_Balotellitubies.Services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.brightfuture.RaysRentals_Balotellitubies.DAO.CustomerDAO;
import uk.co.brightfuture.RaysRentals_Balotellitubies.Model.CustomerModel;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	@Qualifier("CustomerDAO")
	CustomerDAO customerDAO;

	@Override
	public List<CustomerModel> retrieveAllCustomers() {
		return customerDAO.retrieveAllCustomers();
	}
}
