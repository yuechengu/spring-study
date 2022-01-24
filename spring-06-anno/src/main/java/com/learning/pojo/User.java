package com.learning.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.learning.pojo.User"/>
@Component
public class User {

    //等价于<property name="name" value="王二麻子"/>
    @Value("王二麻子")
    public String name;
}
