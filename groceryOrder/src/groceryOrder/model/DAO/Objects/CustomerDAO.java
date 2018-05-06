package groceryOrder.model.DAO.Objects;

import java.sql.Connection;

import groceryOrder.model.BO.Customer;
import groceryOrder.model.DAO.Interfaces.IntCustomerDAO;

public class CustomerDAO extends UserDAO implements IntCustomerDAO {

	public CustomerDAO(Connection conn) {
		super(conn);
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
