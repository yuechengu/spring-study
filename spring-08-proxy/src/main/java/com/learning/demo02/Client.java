package com.learning.demo02;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.add();
    }
}
