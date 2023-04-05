package com.gaz.app.dicovsse;

import com.gaz.app.dicovsse.controller.VideoController;
import com.gaz.app.dicovsse.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class DiCovsSeApplication
{

    public static void main(String[] args)
    {
        ConfigurableApplicationContext app = SpringApplication.run(DiCovsSeApplication.class, args);
       Arrays.stream(app.getBeanDefinitionNames()).forEach(System.out::println);
    }
       @Bean
        public CommandLineRunner commandLineRunner ()
       {
           return args ->{
               System.out.println("Hello from the commandLineRunner");
           };
        }
}
