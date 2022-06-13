import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;//is interface

public class B {
	public static void main(String[] args) {
		try {//connection is an interface
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","anujabhay");
			System.out.println(con);
			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from table1 where city='rewa'");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

