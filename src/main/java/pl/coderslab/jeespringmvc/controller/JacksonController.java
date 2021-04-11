package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.jeespringmvc.model.Product;

import java.time.LocalTime;

@RestController
public class JacksonController {
    @GetMapping("/jackson")
    public Product jackson(){
        return new Product("prodname", 12.34);
    }

    @PostMapping("/jacksonpost")
    public String encoding(@RequestBody Product product){
        return product.toString();
    }
}
