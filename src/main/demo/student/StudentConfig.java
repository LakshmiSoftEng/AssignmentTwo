package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Lakshmi = new Student(
                    1L,
                    "Lakshmi",
                    "lxm51640.edu",
                    LocalDate.of(2020, 1,27),
                    21

            );
            Student Mareedu = new Student(
                    1L,
                    "Mareedu",
                    "Mareedu@ucmo.edu",
                    LocalDate.of(2020, 1,27),
                    21

            );

            repository.saveAll(
                    List.of(Lakshmi, Mareedu)
            );
        };
    }
}