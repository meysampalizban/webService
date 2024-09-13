package ir.spring.createapp001.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import ir.spring.createapp001.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class SavaData {
		
		@PersistenceContext
		private EntityManager entityManager;
		

		public  int savaUser(User user) {
			entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
			Session session = entityManager.unwrap(Session.class);
			Transaction transaction = session.getTransaction();
			transaction.begin();
	    	session.persist(user);
	    	transaction.commit();
	    	if(!(transaction.isActive())){
	    		transaction.rollback();
	    		return 0;
	    	}
	    	session.close();
	    	entityManager.close();
	    	return 1;
		}
	    	
}
