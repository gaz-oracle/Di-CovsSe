package com.gaz.app.dicovsse.controller;

import com.gaz.app.dicovsse.repository.VideoRepository;

// CLASE DEPENDIENTE.
public class VideoController {

    private final VideoRepository repository;

    public VideoController(VideoRepository repository) {
        this.repository = repository;
    }

    public String next(){
        return "Next Video";
    }

}
