package SpringAop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");
        configurableApplicationContext.start();
        Demo demo=configurableApplicationContext.getBean("demo",Demo.class);
        demo.display();
        configurableApplicationContext.stop();
        configurableApplicationContext.close();
    }
}
