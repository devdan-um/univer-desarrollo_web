package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class NuevoController {

    @GetMapping("/registro")
    public String formulario(){
        return "form";
    }

    @PostMapping("/guardado")
    public String success(@ModelAttribute Estudiante request){
        System.out.println(request);
        return "success";
    }

}
