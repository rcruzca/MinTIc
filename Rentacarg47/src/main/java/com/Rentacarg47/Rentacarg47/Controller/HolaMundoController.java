package com.Rentacarg47.Rentacarg47.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("hola")
    public String Hola(){
        return "Hola mundo";
    }
    
}
