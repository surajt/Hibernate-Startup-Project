package testcase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import junit.framework.TestCase;
import suraj.volunteering.Users;

public class UserTest extends TestCase {
	private SessionFactory sessionFactory;
    private Session session = null;
    @Before
    public void before() {
     // setup the session factory
     AnnotationConfiguration configuration = new AnnotationConfiguration();
     configuration.addAnnotatedClass(SuperHero.class)
       .addAnnotatedClass(Users.class)      ;
     configuration.setProperty("hibernate.dialect",
       "org.hibernate.dialect.H2Dialect");
     configuration.setProperty("hibernate.connection.driver_class",
       "org.h2.Driver");
     configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/volunteering1");
     configuration.setProperty("hibernate.hbm2ddl.auto", "create");
     sessionFactory = configuration.buildSessionFactory();
     session = sessionFactory.openSession();
    }
    @Test
    public void returnsHerosWithMatchingType() {
     // create the objects needed for testing
     Users users = new Users();
     users.setFullName("Johb");
     users.save();
    
    }
    @After
    public void after() {
     session.close();
     sessionFactory.close();
    }
    
}
