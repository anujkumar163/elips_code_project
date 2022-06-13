package hibernate1;

import javax.security.auth.login.Configuration;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import antlr.collections.List;
//show table
public class B {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		sessionsession = sessionFactory.openSession();
		session.beginTransaction();
		Querry querry = session.createQuerry(" from Userdetails");
		List info = querry.list();
		Iterator itr = info.iterator();
		while(itr.hasNext()) {
			UserDetails u1 =(UserDetails) itr.next();
			System.out.println(u1.getId());
			System.out.println(u1.getName());
		
		
		}
		
			
			
			
		
		
		
	}
}
