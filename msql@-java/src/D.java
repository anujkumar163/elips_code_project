
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class D{
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","anujabhay");
			System.out.println(con);
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from table1");
			while(result.next()) {
				//System.out.println(result.getString(1));
				//System.out.println(result.getString("city"));
				//System.out.println(result.getString("mobile"));
				System.out.println(1 + "\t\t" + 2 + "\t\t" + 3);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
}
