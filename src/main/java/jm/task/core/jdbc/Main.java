package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Sidorov", (byte) 32);
        userService.saveUser("Ivan", "Ivanov", (byte) 54);
        userService.saveUser("Petr", "Petrov", (byte) 24);
        userService.saveUser("Vasay", "Pupkin", (byte) 19);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
