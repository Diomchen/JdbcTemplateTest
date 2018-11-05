import my.Spring.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao.selectUser(1));
    }

}
