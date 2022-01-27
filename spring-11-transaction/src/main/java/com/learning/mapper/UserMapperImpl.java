package com.learning.mapper;

import com.learning.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> queryUsers() {

        /*测试ACID*/
        User badman = new User(6, "坏人", "999999");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(badman);
        mapper.deleteUser(6);

        return getSqlSession().getMapper(UserMapper.class).queryUsers();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
