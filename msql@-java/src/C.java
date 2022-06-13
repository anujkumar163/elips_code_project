import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;//is interface

public class C {
	public static void main(String[] args) {
		try {//connection is an interface
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","anujabhay");
			System.out.println(con);
			Statement stmt = con.createStatement();
			stmt.executeUpdate("update table1 set city='catna',lastname='kumar' where city='rewau'");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


