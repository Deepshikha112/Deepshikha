package DemoAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Database
{
    static String portname;
    static int port;

   public void setPort(int port)
    {
        this.port=port;
    }
    public void setPortname(String portname) {
        this.portname=portname;
    }

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Database database=context.getBean("database",Database.class);
        System.out.println(port);
        System.out.println(portname);
    }


}
