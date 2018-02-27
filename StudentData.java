import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class StudentData {

Connection conn = null;
	
	public static Connection dbConnector(){
		
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Public\\StudentID.db");
			 conn.setAutoCommit(false);
			 System.out.println("Connection Successfull!");
			return conn;
		}catch(Exception e){
			 System.out.println("Connection Failed"+ e);
			return null;
		}
	}

	


	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//		dbConnector();
	//}

}
