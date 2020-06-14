package br.com.ronistone.labapp.service;


import java.util.List;
import java.util.Optional;

import br.com.ronistone.labapp.model.Car;

public interface CarService {
    Optional<List<Car>> getAllCars();

    Optional<Car> getCarById(Long id);
}
