package groceryOrder.model.DAO.Objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	// DESIGN PATTERN : Singleton
	
	
	private static String url = "jdbc:postgresql://localhost:5432/groceryAppDatabase";
	private static String username = "postgres";
	private static String passwd = "root";
	private static Connection connect = null;
	
	public static Connection getInstance(){
	    if(connect == null){
	      try {
	        connect = DriverManager.getConnection(url, username, passwd);
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }      
	    return connect;
	  }     

}
