package com.demo.demo;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final PizzaConfig pizzaConfig = new PizzaConfig(
                "tomato", "mozzarella", "thin"

        );

        log.info(
                String.format("I want a %s crusp pizza with a %s sauce and %s topping",
                        pizzaConfig.getCrusp(),
                        pizzaConfig.getSauce(),
                        pizzaConfig.getTopping())
        );
    }
}
