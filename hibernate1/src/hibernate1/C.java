package hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//update table
public class C {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	UserDetails user = (UserDetail)session.get(UserDetails.class,1);
	user.setId();
	user.setName();
	session.getTransaction().commit();
	session.close();
	
}
