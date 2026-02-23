package orm.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import orm.models.*;
import java.io.InputStream;
import java.util.Properties;

public class HibernateUtil {

    private static StandardServiceRegistry serviceRegistry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // 1. Load properties from file
                Properties hibernateProps = new Properties();
                InputStream inputStream = HibernateUtil.class.getClassLoader().getResourceAsStream("hibernate.properties");
                if (inputStream != null) {
                    hibernateProps.load(inputStream);
                } else {
                    System.err.println("hibernate.properties file not found in classpath!");
                    // Handle error or set properties programmatically if file is missing
                }

                // 2. Create ServiceRegistry from properties
                StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
                registryBuilder.applySettings(hibernateProps);
                serviceRegistry = registryBuilder.build();

                // 3. Create MetadataSources and add annotated entity classes
                MetadataSources metadataSources = new MetadataSources(serviceRegistry);
                metadataSources.addAnnotatedClass(Player.class);
                metadataSources.addAnnotatedClass(Team.class); 

                // 4. Build Metadata and then SessionFactory
                Metadata metadata = metadataSources.buildMetadata();
                sessionFactory = metadata.getSessionFactoryBuilder().build();

            } catch (Exception e) {
                e.printStackTrace();
                if (serviceRegistry != null) {
                    StandardServiceRegistryBuilder.destroy(serviceRegistry);
                }
            }
        }
        return sessionFactory;
    }

    // Method to get the current session
    public static Session getSession() {
        return getSessionFactory().openSession(); // openSession() always a new session
        // or getSessionFactory().getCurrentSession(); // uses the session in the current context
    }
}
