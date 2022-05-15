package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/my_new_schema";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(jm.task.core.jdbc.model.User.class);
            configuration.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
            configuration.setProperty(Environment.URL, URL);
            configuration.setProperty(Environment.USER, USERNAME);
            configuration.setProperty(Environment.PASS, PASSWORD);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
