import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;//is interface
//jdbc
public class A {
	public static void main(String[] args) {
		try {//connection is an interface
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","anujabhay");
			System.out.println(con);
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into table1 value('smith','rewa','12345')");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
