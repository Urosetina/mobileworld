package dao;

import model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import common.CommonMethods;

public class RegistrationLoginDao {

	SessionFactory sf = HibernateUtil.createSessionFactory();
	
	
	public boolean addUser(User user) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		try {
			
			session.save(user);
			
			
			session.getTransaction().commit();
				System.out.println("User with username: " + user.getUsername() + " is added to the Database!");
			
				return true;
				
		} catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
				System.out.println("User wasn't added to the Database!");
				
				return false;
			
		} finally {
			
			session.close();
		}
		
	}

	
	
	
	
	
	
	
	
	
}
