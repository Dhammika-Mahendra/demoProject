package com.example.demoProject.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/{id}")
    public String helloWorldById(@PathVariable String id){
        return "Hello " + id;
    }
}
