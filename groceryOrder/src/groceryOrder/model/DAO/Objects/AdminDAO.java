package groceryOrder.model.DAO.Objects;

import java.sql.Connection;

import groceryOrder.model.BO.Admin;
import groceryOrder.model.DAO.Interfaces.IntAdminDAO;

public class AdminDAO extends UserDAO implements IntAdminDAO {

	public AdminDAO(Connection conn) {
		super(conn);
	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Admin customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Admin getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
