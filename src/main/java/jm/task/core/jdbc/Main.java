package jm.task.core.jdbc;

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
    }
}
