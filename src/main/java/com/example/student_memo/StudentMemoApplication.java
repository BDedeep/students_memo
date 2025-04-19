package com.example.student_memo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.student_memo") // Ensure that this includes the controller package
public class StudentMemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentMemoApplication.class, args);
    }
}