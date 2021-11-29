package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.User;

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
	
	
	
	
	
	
	
	
	
	
	
	
}
