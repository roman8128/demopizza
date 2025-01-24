package com.demo.demo;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
@AllArgsConstructor
public class DemoApplication implements CommandLineRunner {
	private PizzaConfig pizzaConfig;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(
                String.format("I want a %s crusp pizza with a %s sauce and %s topping",
                        pizzaConfig.getCrust(),
                        pizzaConfig.getSauce(),
                        pizzaConfig.getTopping())
        );
    }
}
