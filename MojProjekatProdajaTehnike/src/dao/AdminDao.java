package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.User;
import model.UserType;

public class AdminDao {

	SessionFactory sf = HibernateUtil.createSessionFactory();

	public List<User> returnAllUsers() {
		
		List<User> users = new ArrayList();

		Session session = sf.openSession();
		session.beginTransaction();
		
		try {
			
			String hql = "from User";
				Query query = session.createQuery(hql);
					
					users = (List<User>) query.getResultList();
						
						System.out.println("Obtained all users!");
			
			session.getTransaction().commit();
				return users;
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
				System.out.println("Didn't get any users!");
			session.getTransaction().rollback();
				return null;
			
		} finally {
			
			session.close();
		}
		
		
	}

	public List<User> returnUserByType(UserType type) {
		
		List<User> users = new ArrayList();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		try {
			
			String hql = "from User ";
			
			if(type != null) {
				
				hql += "where userType = :type";
			}
			
			System.out.println("hql: " + hql);
			Query query = session.createQuery(hql);
				
			if(type != null) {
				
				query.setParameter("type", type);
			}
			
			users = (List<User>)query.getResultList();
			
			session.getTransaction().commit();
				return users;
			
		} catch(Exception e) {
			
			System.out.println("Couldn't return users!");
				e.printStackTrace();
			
			session.getTransaction().rollback();
				return null;
			
		} finally {
			
			session.close();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
