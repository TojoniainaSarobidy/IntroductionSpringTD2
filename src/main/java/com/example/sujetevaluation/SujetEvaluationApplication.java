package com.example.sujetevaluation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"entity", "repository", "service", "controller"})
public class SujetEvaluationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SujetEvaluationApplication.class, args);
    }

}
