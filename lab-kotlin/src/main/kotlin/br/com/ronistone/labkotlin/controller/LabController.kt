package br.com.ronistone.labkotlin.controller

import br.com.ronistone.labkotlin.model.Car
import br.com.ronistone.labkotlin.service.CarService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Thread.sleep

@RestController
@RequestMapping("/lab")
class LabController(
        val carService: CarService
) {

    @GetMapping
    fun listAll(): ResponseEntity<MutableList<Car>> {
        val cars = carService.getAllCars()

        if(cars != null) {
            sleep(120000)
            return ResponseEntity.ok(cars)
        }

        return ResponseEntity.notFound().build()
    }

    @GetMapping("/{id}")
    fun getCarById( @PathVariable("id") id: Long ): ResponseEntity<Car> {
        val car: Car? = carService.getCarById(id)

        if (car != null) {
            return ResponseEntity.ok(car)
        }

        return ResponseEntity.notFound().build()
    }

}
