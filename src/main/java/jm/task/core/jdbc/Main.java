package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao a = new UserDaoJDBCImpl();
        a.createUsersTable();
        a.saveUser("name1", "lastname1", (byte) 20);
        a.saveUser("name2", "lastname2", (byte) 30);
        a.saveUser("name3", "lastname3", (byte) 40);
        a.saveUser("name4", "lastname4", (byte) 50);

        a.removeUserById(1);
        a.getAllUsers();
        a.cleanUsersTable();
        a.dropUsersTable();
    }
}
