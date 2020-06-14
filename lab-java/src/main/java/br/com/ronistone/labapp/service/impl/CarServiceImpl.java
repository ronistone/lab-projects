package br.com.ronistone.labapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ronistone.labapp.model.Car;
import br.com.ronistone.labapp.repository.CarRepository;
import br.com.ronistone.labapp.service.CarService;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;


    @Override
    public Optional<List<Car>> getAllCars() {
        return Optional.of(carRepository.findAll());
    }

    @Override
    public Optional<Car> getCarById(Long id) {
        return carRepository.findByIdWithSleep(id);
    }

}
