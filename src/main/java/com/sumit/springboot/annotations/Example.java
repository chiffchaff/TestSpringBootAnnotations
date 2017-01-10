package com.sumit.springboot.annotations;

/**
 * Created by sumijaiswal on 1/10/17.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * http://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html
 *
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
