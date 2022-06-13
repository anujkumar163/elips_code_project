package mysql_1;

import java.sql.Connection;
import java.sql.DriverManager;

public class A{
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","anujabhay");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}