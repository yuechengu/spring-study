package com.learning.mapper;

import com.learning.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryUsers();

    public int addUser(User user);

    public int deleteUser(int id);
}
