package jm.task.core.jdbc.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import java.lang.module.Configuration;

public class Util {
    final static String url = "jdbc:postgresql://localhost:5432/postgres";
    final static String LOGIN = "postgres";
    final static String PASSWORD = "admin";
    private static SessionFactory sessionFactory = null;

    //    public static Connection getConnection() {
//        try {
//            con = DriverManager.getConnection(url, login, password);
//        } catch (SQLException e2) {
//            e2.printStackTrace();
//        }
//        return con;
//    }
    public static SessionFactory getConnection() {
        try {
            Configuration configuration = new Configuration();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
