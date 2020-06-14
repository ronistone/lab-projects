package br.com.ronistone.labapp.controller;

import static java.lang.Thread.sleep;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ronistone.labapp.service.CarService;

@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("/lab")
public class LabController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity listAll() throws InterruptedException {

        Optional cars = carService.getAllCars();

        if(cars.isPresent()) {
            sleep(120000);
            return ResponseEntity.ok(cars.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getCarById(@PathVariable("id") Long id) {
        Optional car = carService.getCarById(id);

        if(car.isPresent()) {
            return ResponseEntity.ok(car.get());
        }
        return ResponseEntity.notFound().build();
    }

}
