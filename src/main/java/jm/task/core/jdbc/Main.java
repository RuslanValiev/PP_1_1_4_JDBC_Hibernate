package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Жан","Клод", (byte) 20);
        userService.saveUser("Ван","Дам", (byte) 22);
        userService.saveUser("Сильвестр","Сталлоне", (byte) 24);
        userService.saveUser("Рокки","Больбоа", (byte) 23);
        System.out.println(userService.getAllUsers());
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();

//        UserDao userDao = new UserDaoJDBCImpl();
//        userDao.createUsersTable();
//        userDao.saveUser("dsfkjfd", "ljljdsjdgh", (byte) 14);
//        userDao.saveUser("Name1", "LastName1", (byte) 20);
//        userDao.saveUser("Name2", "LastName2", (byte) 25);
//        userDao.saveUser("Name3", "LastName3", (byte) 31);
//        userDao.saveUser("Name4", "LastName4", (byte) 38);
//
//
//
////        userDao.removeUserById(1);
//        System.out.println(userDao.getAllUsers());
//        userDao.cleanUsersTable();
//        userDao.dropUsersTable();
    }
}
