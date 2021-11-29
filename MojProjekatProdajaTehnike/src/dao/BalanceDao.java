package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.User;
import model.UserDetails;

public class BalanceDao {

	SessionFactory sf = HibernateUtil.createSessionFactory();
	
	public User returnUserByUsername(String username) {
		
		User user = null;
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		try {
			
			String hql = "from User WHERE username = :username";
			Query query = session.createQuery(hql);
			
				query.setParameter("username", username);
				
				user = (User) query.getSingleResult();
			
			
			
			
			System.out.println("User found!");
				session.getTransaction().commit();
					return user;
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			System.out.println("Couldn't return user!");
				session.getTransaction().rollback();
					return null;
					
		} finally {
			
			session.close();
		}
		
		
	}

	public boolean addBalance(User user, Double balance) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		try {
			
			User userFromDatabase = session.get(User.class, user.getIdUser());
				String hql = "from UserDetails where user = :userFromDatabase";
			
			Query query = session.createQuery(hql);
				query.setParameter("userFromDatabase", userFromDatabase);
				
				
			UserDetails details = (UserDetails) query.getSingleResult();
				System.out.println("UserDetails found!");
				
					
					details.setBalance(details.getBalance() + balance);
					details.setBalance(balance);
		
				
				
			
				session.getTransaction().commit();
					return true;
			
		} catch(Exception e) {
			
			e.printStackTrace();
				System.out.println("");
					session.getTransaction().rollback();
						return false;
				
		} finally {
			
			session.close();
		}
		
	}

	

	
	
}
