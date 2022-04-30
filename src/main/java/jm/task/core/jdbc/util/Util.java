package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Util {
//    final static String url = "jdbc:postgresql://localhost:5432/postgres";
//    final static String login = "postgres";
//    final static String password = "admin";
//    private static SessionFactory sessionFactory = null;

    //    public static Connection getConnection() {
//        try {
//            con = DriverManager.getConnection(url, login, password);
//        } catch (SQLException e2) {
//            e2.printStackTrace();
//        }
//        return con;
//    }
    private static final String driver = "org.postgresql.Driver";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres?useSSL=false&amp;serverTimezone=UTC";
    private static final String login = "postgres";
    private static final String password = "admin";
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getConnection() {
        try {
            Configuration configuration = new Configuration()
                    .setProperty("hibernate.connection.driver_class", driver)
                    .setProperty("hibernate.connection.url", url)
                    .setProperty("hibernate.connection.username", login)
                    .setProperty("hibernate.connection.password", password)
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                    .addAnnotatedClass(User.class)
                    .setProperty("hibernate.c3p0.min_size", "5")
                    .setProperty("hibernate.c3p0.max_size", "200")
                    .setProperty("hibernate.c3p0.max_statements", "200");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
