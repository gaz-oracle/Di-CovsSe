package com.gaz.app.dicovsse.controller;

import com.gaz.app.dicovsse.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

// CLASE DEPENDIENTE.
@RestController
public class VideoController {
    /**
     * Hay 3 Formas de Obtener una dependencia en una clase:
     * 1. Constructor Injection.---------------------------------> FTW
     * 2. Setter Injection.
     * 3. Field Injection
     */
    /**
     *  3. Field Injectio
     */
    @Autowired
    private  VideoRepository repository;  // Field injection is not recommended, only for TEST

    /** 1. Constructor Injection.
     * @Autowired : Le dice a Spring, requiero que conectes de manera Automatica o Inyectes esta Dependencia
     * por mi, conecta o inyecta: VideoRepository a VideoController a nivel de CONSTRUCTOR.
     * VideoController <--(VideoRepository name_x),
     * se puede omitir el @Autowired cuando es solo un constructor.
     */
    /**
     * @Autowired
     *     public VideoController(VideoRepository repository) {
     *         this.repository = repository;
     *     }
     */

    /** 2. Setter Injection.
    @Autowired
    public void setRepository(VideoRepository repository) {
        this.repository = repository;
    }
     *   Inyeccion a Traves de metodo Setter: setRepository <-- VideoRepository
     *   No se pueden usar Fields "finql".
     */



    public String next(){
        return "Next Video";
    }

    /**
     * Creacion de Objeto de manera manual, donde se instancia a partir de otra,
     *         Clase que se ha inviocado...
     *
     *     public VideoController() {
     *         this.repository = new VideoRepository();
     *     }
     */

}
