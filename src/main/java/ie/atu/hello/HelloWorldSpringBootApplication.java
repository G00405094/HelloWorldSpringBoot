package ie.atu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringBootApplication.class, args);
    }

}
