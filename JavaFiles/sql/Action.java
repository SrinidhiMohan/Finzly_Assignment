package advancedJava.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Action {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finzly","root","admin");
	String query = "Select * from loign";
	Statement st = con.createStatement();
	st.executeQuery(query);
	System.out.println(2);
	// Create Operation
//	String sql = "INSERT INTO loign (id, username, password) VALUES (?, ?, ?)";
//	   PreparedStatement statement = con.prepareStatement(sql);
//	   statement.setInt(1, 123);
//	   statement.setString(2, "Srinidhi");
//	   statement.setString(3, "123456");
//	   statement.executeUpdate();
//	   System.out.println("Record created.");
	   
	  // Read Operation
	   
//	   String sql = "SELECT id, username, password FROM loign WHERE id = 123";
//	   PreparedStatement statement = con.prepareStatement(sql);
//	   //statement.setInt(1, 1);
//	   ResultSet result = statement.executeQuery();
//	   if (result.next()) {
//	       String column1 = result.getString("id");
//	       String column2 = result.getString("username");
//	       int column3 = result.getInt("password");
//	       System.out.println("id: " + column1);
//	       System.out.println("username: " + column2);
//	       System.out.println("password: " + column3);
//	   }
//	   
	   // Update Operation
//	   String sql = "UPDATE loign SET username = ? WHERE id = 123";
//	   PreparedStatement statement = con.prepareStatement(sql);
//	   statement.setString(1, "Srinidhi Mohan");
//	   statement.executeUpdate();
//	   System.out.println("Record updated.");
	   //Delete Operation
	   
	   String sql = "DELETE FROM loign WHERE id = 1234";
	   PreparedStatement statement = con.prepareStatement(sql);
	   //statement.setInt(1, 1);
	   statement.executeUpdate();
	   System.out.println("Record deleted.");
	   
}
}
