package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {


////    Connection connection = Util.getConnection();
////    Statement statement;
//
//    {
//        try {
//            statement = connection.createStatement();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public void createUsersTable() {

//        try {
//            statement.execute("CREATE TABLE IF NOT EXISTS `my_new_schema`.`users` (\n" +
//                    "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
//                    "  `Name` VARCHAR(45) NULL,\n" +
//                    "  `LastName` VARCHAR(45) NULL,\n" +
//                    "  `Age` INT NULL,\n" +
//                    "  PRIMARY KEY (`id`))");
//            System.out.println("Таблица \"USERS\" создана");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void dropUsersTable() {

//        try {
//            statement.execute("DROP TABLE  IF EXISTS  `my_new_schema`.`users`");
//            System.out.println("Таблица \"Users\" удалена");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO `my_new_schema`.`users` (`Name`, `LastName`, `Age`) " +
//                "VALUES (" + "'" + name + "'" + " , " + "'" + lastName + "'" + ", " + "'" + age + "'" + ");";
//        try {
//            statement.execute(sql);
//            System.out.println("Пользователь " + name + " добавлен в таблицу" );
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void removeUserById(long id) {
//        try {
//            statement.execute("DELETE FROM  `my_new_schema`.`users` WHERE Id =" + id + ";");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
//        try {
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM `my_new_schema`.`users`");
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong(1));
//                user.setName(resultSet.getString(2));
//                user.setLastName(resultSet.getString(3));
//                user.setAge(resultSet.getByte(4));
//                list.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return list;
    }

    public void cleanUsersTable() {
//        try {
//            statement.execute("TRUNCATE TABLE `my_new_schema`.`users`");
//            System.out.println("Таблица \"Users\" очищена");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
