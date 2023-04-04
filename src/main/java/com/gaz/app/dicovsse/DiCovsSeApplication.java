package com.gaz.app.dicovsse;

import com.gaz.app.dicovsse.controller.VideoController;
import com.gaz.app.dicovsse.repository.VideoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiCovsSeApplication {

    public static void main(String[] args)  {
        VideoRepository repository = new VideoRepository();
        VideoController controller = new VideoController(repository);
        String response = controller.next();
        System.out.println(response);


        SpringApplication.run(DiCovsSeApplication.class, args);
    }


}
