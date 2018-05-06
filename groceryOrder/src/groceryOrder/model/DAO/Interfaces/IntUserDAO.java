package groceryOrder.model.DAO.Interfaces;

import groceryOrder.model.BO.User;

public interface IntUserDAO {
	public void delete(User user);
	public void update(User user);
}
