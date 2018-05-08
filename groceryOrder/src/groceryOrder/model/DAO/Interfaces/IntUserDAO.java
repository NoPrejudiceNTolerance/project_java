package groceryOrder.model.DAO.Interfaces;

import groceryOrder.model.BO.Copy;
import groceryOrder.model.BO.User;

public interface IntUserDAO {
	public void delete(User user);
	public void update(User user);
	public void add(User user);
	public boolean exist(int id);
	public boolean exist(User user);
	public int nextId();
	public User connect(String password, String username);
	public boolean isAdmin(int id);
	public void modifyName(String name, User user);
	public void modifyLastname(String name, User user);
}
