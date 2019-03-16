package DemoSpringFramework;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Aspect
public class MyAspect {
//    @Before("execution( void display())")
//    void beforeAdvice() {
//        System.out.println("Running before advice");
//    }


        @Before("displayPointcut() || getStringPointcut()")
        void beforeAdvice() {
            System.out.println("Running before advice");
        }

        @After("displayPointcut()")
        void afterAdvice(){
            System.out.println("Running after advice");
        }

        @Pointcut("execution(void display())")
        void displayPointcut(){}

        @Pointcut("execution(String getString())")
        void getStringPointcut(){}

    }

