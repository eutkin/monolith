package io.github.eutkin.monolith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Monolith {

    public static void main(String[] args) {
        SpringApplication.run(Monolith.class, args)
                .getBean(SomeMonolithService.class)
                .doSomething();
    }
}
