import my.Spring.UserTemplateDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatis {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        UserTemplateDao userTemplateDao = (UserTemplateDao) applicationContext.getBean("userTemplateDao");
        System.out.println(userTemplateDao.getUsername(1));
    }

}
