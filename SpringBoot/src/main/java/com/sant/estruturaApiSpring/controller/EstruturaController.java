package com.sant.estruturaApiSpring.controller;

import com.sant.estruturaApiSpring.model.EstruturaModel;
import com.sant.estruturaApiSpring.repository.EstruturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EstruturaController {

    @Autowired
    private EstruturaRepository estruturaRepository;

    @GetMapping("/exemplos")
    public List<EstruturaModel> getTodasLinhas() {
        return estruturaRepository.findAll();
    }

}
