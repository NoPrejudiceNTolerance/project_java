package groceryOrder.model.DAO.Objects;

import java.sql.Connection;

public class FactoryDAO {

	protected static final Connection conn = DatabaseConnection.getInstance();
	
	public static AdminDAO getAdminDAO(){
		return new AdminDAO(conn);
	}
	
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAO(conn);
	}
	
	public static CopyDAO getCopyDAO() {
		return new CopyDAO(conn);
	}
	
	public static OrderDAO getOrderDAO() {
		return new OrderDAO(conn);
	}
	
	public static ShopDAO getShopDAO() {
		return new ShopDAO(conn);
	}
	
	public static ItemDAO getItemDAO() {
		return new ItemDAO(conn);
	}
}
