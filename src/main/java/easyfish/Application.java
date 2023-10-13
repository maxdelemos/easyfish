package easyfish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationModules modules = ApplicationModules.of(Application.class);
        modules.forEach(System.out::println);
        modules.verify();
        SpringApplication.run(Application.class, args);
    }
}
