package DemoSpringFramework;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
        //ctx.start();
        Dummy dummy = ctx.getBean("dummy",Dummy.class);
        System.out.println(dummy.getString());
        dummy.display();
        //ctx.stop();
    }
}
