package suraj.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.apache.log4j.Logger;

import suraj.volunteering.UserType;
import suraj.volunteering.Users;

public class App {
	private static Logger logger = Logger.getLogger(App.class);

	private static final EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("surajHibernateStartup");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void main(String[] args) {
		EntityManager em = null;
		EntityTransaction tx = null;
		
		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			
			UserType ut = new UserType();
			Users u = new Users();

			logger.trace("Creating Tables... ");
		} catch(PersistenceException e) {
			if (tx != null) {
				logger.error("Rolling back:", e);
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	
}
