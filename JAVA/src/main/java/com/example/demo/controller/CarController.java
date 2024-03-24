package com.example.demo.controller;


import com.example.demo.car.Car;
import com.example.demo.exception.CarAlreadyExistsException;
import com.example.demo.exception.CarNotFoundException;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {
    CarService carService;


    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/car/{id}")
    public ResponseEntity<Car> getCar(@PathVariable String id){
        Car car = carService.getCarFromRepository(id);

        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @PostMapping("car/add/")
    public void createCar(@RequestBody Car car) {
        carService.fillCar(car);
    }

    @DeleteMapping("car/delete/{id}")
    public void deleteCar(@PathVariable String id){
        carService.deleteCar(id);
    }

    @PutMapping("car/update/{id}")
    public void updateCar(@PathVariable String id, @RequestBody Car car){
        carService.updateCar(id, car);
    }

}
