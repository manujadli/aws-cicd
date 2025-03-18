package com.javatechie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

	@GetMapping("/sayHello")
    public ResponseEntity<?> sayHello() {
        System.out.println("GreetingsController.sayHello()");
        return new ResponseEntity<String>("Hi Manu", HttpStatus.OK);
    }
}
