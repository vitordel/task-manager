package com.task.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    @GetMapping("/test-api")
    private String teste() {
        return "Sucesso";
    }

    @GetMapping("/test-api-welcome")
    public String testWelcome(@RequestParam(name = "nome") String nome) {
        return "Hello " + nome + ", seja bem vindo!";
    }
}
