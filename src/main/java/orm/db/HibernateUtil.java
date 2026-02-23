package orm.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.properties
            Configuration configuration = new Configuration();
            
            // The configure() method implicitly looks for hibernate.properties or hibernate.cfg.xml in the classpath
            configuration.configure(); 
            
            // Register your entity classes with the configuration
            configuration.addAnnotatedClass(orm.models.Player.class);
            configuration.addAnnotatedClass(orm.models.Team.class);
            
            // Build the SessionFactory
            return configuration.buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
