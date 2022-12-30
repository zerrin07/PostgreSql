import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn_delete{
	  public static final String url = "jdbc:postgresql:deneme2";
	  public static final String user = "postgres";
	  public static final String password = "A123456a";
	  
	  public static void main(String[] args) {
		  Connection connect = null;
		  String insertSql = "DELETE FROM student WHERE student_id=4";
		  
		  try {
			  connect = DriverManager.getConnection(url,user,password);
			  Statement st= connect.createStatement();
			  System.out.println(st.executeUpdate(insertSql));
			 
			 
		  }catch(SQLException e ) {
			  System.out.println(e.getMessage());
			  
		  }
	  }
}
