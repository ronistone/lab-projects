package br.com.ronistone.labkotlin.service.impl

import br.com.ronistone.labkotlin.model.Car
import br.com.ronistone.labkotlin.repository.CarRepository
import br.com.ronistone.labkotlin.service.CarService
import org.springframework.stereotype.Service

@Service
class CarServiceImpl(
        val carRepository: CarRepository
): CarService {

    override fun getAllCars(): MutableList<Car>? {
        return carRepository.findAll();
    }

    override fun getCarById(id: Long): Car? {
        return carRepository.findByIdWithSleep(id)
    }

}
