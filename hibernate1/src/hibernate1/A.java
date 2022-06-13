package hibernate1;
//hibernate
import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class A {
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setId(1);
		user.setName("anuj");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		
	}
}
