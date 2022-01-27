import com.learning.mapper.UserMapper;
import com.learning.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.queryUsers()) {
            System.out.println(user);
        }
    }

    @Test
    public void testTx() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> users = userMapper.queryUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
