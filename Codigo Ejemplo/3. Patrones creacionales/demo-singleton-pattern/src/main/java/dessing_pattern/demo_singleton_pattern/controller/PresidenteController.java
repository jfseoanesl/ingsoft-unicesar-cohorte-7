package dessing_pattern.demo_singleton_pattern.controller;

import dessing_pattern.demo_singleton_pattern.domain.PresidenteSingleton;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PresidenteController {

    @GetMapping
    public PresidenteSingleton getPresidente(){

        PresidenteSingleton petro = PresidenteSingleton.getInstance();
        PresidenteSingleton maduro = PresidenteSingleton.getInstance();
        maduro.setNombre("Nicolas Maduro");
        maduro.setPais("Venezuela");
        maduro.setPartidoPolitico("PSUV");

        return petro;
    }

}
