import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn_select{
	  public static final String url = "jdbc:postgresql:deneme2";
	  public static final String user = "postgres";
	  public static final String password = "A123456a";
	  
	  public static void main(String[] args) {
		  Connection connect = null;
		  String sql = "SELECT * FROM Student";
		 
		  try {
			  connect = DriverManager.getConnection(url,user,password);
			  Statement st= connect.createStatement();
			  ResultSet data = st.executeQuery(sql);
			  while(data.next())
			  {
				  System.out.println("id:" +data.getInt("student_id"));
				  System.out.println("name:" +data.getString("student_name"));
				  System.out.println("class:" +data.getInt("student_class"));
			  }
		  }catch(SQLException e ) {
			  System.out.println(e.getMessage());
			  
		  }
	  }
}
