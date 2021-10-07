package com.allancordeiro.citiesapi.states.repositories;

import com.allancordeiro.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
