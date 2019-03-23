package gaurav.demo.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("gaurav.*")
public class AppStarter {

    public static void main(String[] args) {

        System.out.println("App started");
        SpringApplication.run(AppStarter.class, args);
    }

}
