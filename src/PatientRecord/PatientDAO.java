package PatientRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PatientDAO {


	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl/Patient";


	static final String USER = "C##sirlord";
	static final String PASS = "110Gtstl";

	//private static String LASTNAME;


	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");


			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			System.out.println("Connection successfully established");


			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT patientid, lastname FROM Patient";
			ResultSet rs = stmt.executeQuery(sql);


			while(rs.next()){

				String patientid  = rs.getString("patientid");
				String lastname = rs.getString("lastname");



				System.out.print("ID: " + patientid);
				System.out.print(", LNAME: " + lastname);
				//System.out.print(", First: " + Fname);
				//System.out.println(", County: " + county);
			}

			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){

			se.printStackTrace();
		}catch(Exception e){

			e.printStackTrace();
		}finally{

			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Thanks Manny!");
	}
}

