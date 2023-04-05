package com.gaz.app.dicovsse.controller;

import com.gaz.app.dicovsse.repository.VideoRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VideoControllerTest {
    @MockBean
    private VideoRepository repository;

    @Autowired
    private VideoController controller;

    @Test
    public void contextLoads(){
        Assertions.assertThatNullPointerException();
    }

}