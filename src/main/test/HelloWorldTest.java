import com.xubuxin.ssm.mapper.HelloWorldMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xubuxin
 * @date 2019/4/17 - 11:28
 */
public class HelloWorldTest {

    @Test
    public void HelloWorldSelect(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldMapper helloWorldMapper = applicationContext.getBean(HelloWorldMapper.class);
        System.out.println(helloWorldMapper.selectPeople().get(0).getName());
    }
}
