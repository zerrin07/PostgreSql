import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn_update{
	  public static final String url = "jdbc:postgresql:deneme2";
	  public static final String user = "postgres";
	  public static final String password = "A123456a";
	  
	  public static void main(String[] args) {
		  Connection connect = null;
		  String stSql = "UPDATE student SET student_name='ayşe' WHERE student_id = 1";
		  String insertSql = "UPDATE student SET student_name=? WHERE student_id=? ";
		  try {
			  connect = DriverManager.getConnection(url,user,password);
			  //Statement st= connect.createStatement();
			  //System.out.println(st.executeUpdate(stSql));
			 
			   PreparedStatement pr = connect.prepareStatement(insertSql);
			   pr.setInt(2,3);
			   pr.setString(1, "yağmur");
			   pr.executeUpdate();
		  }catch(SQLException e ) {
			  System.out.println(e.getMessage());
			  
		  }
	  }
}
