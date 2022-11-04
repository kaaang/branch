package com.test.branch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BranchApplication {

    public static void main(String[] args) {
        SpringApplication.run(BranchApplication.class, args);
        System.out.println("1");
        System.out.println("move");
    }

}
