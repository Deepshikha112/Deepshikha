package DemoAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDrink
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
//        Restaurant restaurant=context.getBean("teaRestaurant",Restaurant.class);
//        restaurant.hotDrink.prepareHotDrink();
//        Restaurant restaurant1=context.getBean("expressTeaRestaurant",Restaurant.class);
//        restaurant1.hotDrink.prepareHotDrink();
        Restaurant restaurant=(Restaurant) context.getBean("restaurant",Restaurant.class);
        restaurant.prepareTea();

    }

}
