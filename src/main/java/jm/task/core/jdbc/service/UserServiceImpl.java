package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl userDaoHibernateImpl = new UserDaoJDBCImpl();
    public void createUsersTable() {
        userDaoHibernateImpl.createUsersTable();
    }
    public void dropUsersTable() {
        userDaoHibernateImpl.dropUsersTable();
    }
    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernateImpl.saveUser(name, lastName, age);
    }
    public void removeUserById(long id) {
        userDaoHibernateImpl.removeUserById(id);
    }
    public List<User> getAllUsers() {
        return userDaoHibernateImpl.getAllUsers();
    }
    public void cleanUsersTable() {
        userDaoHibernateImpl.cleanUsersTable();
    }
}
