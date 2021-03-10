package com.daru.springrest.controller;

import com.daru.springrest.response.Computer;
import com.daru.springrest.response.Food;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/food/pizza")
    public Food getPizza(){
        Food pepperoniFood = new Food("pizza", 8);
        return pepperoniFood;
    }

    @GetMapping("/computer")
    public Computer getComputer(){
        Computer computerTwo = new Computer("asus", "3080", 32);
        return computerTwo;
    }

    @PostMapping("/employees")
    Food getGuinness(@RequestBody Food order) {
        Food guiness = new Food("none", 10);
        return guiness;
    }

    // http://localhost:8080/swagger-ui.html
    // swagger json
    // http://localhost:8080/v2/api-docs

}