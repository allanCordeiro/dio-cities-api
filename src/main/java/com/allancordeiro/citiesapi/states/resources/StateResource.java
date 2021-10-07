package com.allancordeiro.citiesapi.states.resources;

import com.allancordeiro.citiesapi.states.entities.State;
import com.allancordeiro.citiesapi.states.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }
}
