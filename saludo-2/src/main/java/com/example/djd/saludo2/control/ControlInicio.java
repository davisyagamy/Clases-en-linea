package com.example.djd.saludo2.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlInicio {

    @GetMapping("/")
    public String iniciar() {
        return "hola mundo otra ves desde spring boot y el IntelliJ IDEA" + "aprendiendo a realizar comentarios";
    }
}
