
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DBConn_insert2{
		  public static final String url = "jdbc:postgresql:deneme2";
		  public static final String user = "postgres";
		  public static final String password = "A123456a";
		  
		  public static void main(String[] args) {
			  Connection connect = null;
			  
			  String prSql = "INSERT INTO student (student_id,student_name,student_class) VALUES(?,?,?)";
			  try {
				  connect = DriverManager.getConnection(url,user,password);
				
				  PreparedStatement prSt = connect.prepareStatement(prSql);
				  prSt.setInt(1,4);
				  prSt.setString(2, "kumsal");                 
				  prSt.setLong(3,6);
				  prSt.executeUpdate();
				  
			
			  }catch(SQLException e ) {
				  System.out.println(e.getMessage());
				  
			  }
		  }
	}


