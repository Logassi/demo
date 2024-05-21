package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student anomol = new Student(
                    "Anomol Isagag",
                    "anomolisagag@gmail.com",
                    LocalDate.of(2000, APRIL, 3)
            );

            Student molano = new Student(
                    "Molano Gasiga",
                    "molano@gmail.com",
                    LocalDate.of(1995, APRIL, 3)
            );

            repository.saveAll(
                    List.of(
                            anomol,
                            molano
                    )
            );
        };
    }
}
