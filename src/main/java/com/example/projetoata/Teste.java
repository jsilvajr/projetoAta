package com.example.projetoata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Teste {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello World";
    }
}
