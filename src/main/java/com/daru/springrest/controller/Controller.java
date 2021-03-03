package com.daru.springrest.controller;

import com.daru.springrest.response.ResponseJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/employees")
    public ResponseJson getMapping(){

        ResponseJson newResponse = new ResponseJson("Pizza", 10);

        return newResponse;
    }

}