package DemoAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Complex
{
    List list;
    Set set;
    Map map;

    public void setList(List list) {
        this.list=list;
    }
    public void setSet(Set set) {
        this.set=set;
    }
    public void setMap(Map map) {
        this.map=map;
    }
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Complex complex=context.getBean("complex",Complex.class);
        System.out.println(complex.list);
        System.out.println(complex.set);
        System.out.println(complex.map);

    }
}
