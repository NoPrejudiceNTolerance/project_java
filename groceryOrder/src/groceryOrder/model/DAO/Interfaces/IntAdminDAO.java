package groceryOrder.model.DAO.Interfaces;

import groceryOrder.model.BO.Admin;

public interface IntAdminDAO {
	public void delete(Admin admin);
	public void add(Admin admin);
	public void update(Admin customer);
	public Admin getAdmin(int id);

}
