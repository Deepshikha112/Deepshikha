package TransactionDemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
@SpringBootApplication(exclude = {JmxAutoConfiguration.class})
public class Main {
    public static void main(String[] args) throws SQLException {
        SpringApplication sa = new SpringApplication(Main.class);
        sa.setBannerMode(Banner.Mode.OFF);
        sa.setLogStartupInfo(false);
        ApplicationContext context = sa.run(args);
        UserDao userDao=context.getBean(UserDao.class);
        userDao.printUserNames();
    }
}