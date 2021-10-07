package com.allancordeiro.citiesapi.countries.repositories;

import com.allancordeiro.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
