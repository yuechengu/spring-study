import com.learning.mapper.UserMapper;
import com.learning.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyTest {
    @Test
    public void test() throws IOException{

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.queryUsers()) {
            System.out.println(user);
        }
    }

    // 版本新增方法测试
    @Test
    public void test2() throws IOException{

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper.queryUsers()) {
            System.out.println(user);
        }
    }
}
