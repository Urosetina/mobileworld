package dao;

import model.User;

import javax.persistence.Query;

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


	public User findUserByUsernameAndPassword(String userName, String password) {
		
		User user = null;
		
		Session session = sf.openSession();
			session.beginTransaction();
		
		try {
			
			String hql = "from User where userName = :name and password = :password";
				Query query = session.createQuery(hql);
				
					query.setParameter("name", userName);
					query.setParameter("password", password);
					
					
					user = (User) query.getSingleResult();
					
						session.getTransaction().commit();
						System.out.println("User found!");
						return user;
			
			
		} catch(Exception e) {
			
			session.getTransaction().rollback();
			
				System.out.println("User not found!");
			return null;
			
		} finally {
			
			session.close();
		}
		
		
	}

	
	
	
	
	
	
	
	
	
}
