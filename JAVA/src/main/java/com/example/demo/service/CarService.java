package com.example.demo.service;


import com.example.demo.car.Car;
import com.example.demo.exception.CarAlreadyExistsException;
import com.example.demo.exception.CarNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CarService {
    private HashMap<String, Car> cars = new HashMap<String, Car>();

    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
       // Car car1 = new Car("Bmw", "e46", "silver");
       // Car car2 = new Car("Merc", "amg", "black");
        //Car car3 = new Car("Tesla", "roadster", "white");

        //cars.put("1",car1);
       // cars.put("2",car2);
       // cars.put("3",car3);
        this.carRepository = carRepository;

        carRepository.save(new Car("Bmw", "e46", "silver", 1L));
        carRepository.save(new Car("Merc", "amg", "black", 2L));


    }

    public Car getCarFromHashmap(String id){
        return cars.get(id);
    }

    public Car getCarFromRepository(String id) {
        Car car = carRepository.findById(Long.parseLong(id));

        if(car == null){
            throw new CarNotFoundException();
        }

        return car;
    }

    public void fillCar(Car car){
        if (carRepository.findById(car.getId()) == null) {
            carRepository.save(car);
        }
        else
            throw new CarAlreadyExistsException();
    }

    public void deleteCar(String id){
        if (carRepository.findById(Long.parseLong(id)) != null) {
            carRepository.deleteById(Long.parseLong(id));
        }
        else{
            throw new CarNotFoundException();
        }

    }

    public void updateCar(String id, Car car) {
        Car repocar = carRepository.findById(Long.parseLong(id));
            if(repocar != null){
            repocar.setMake(car.getMake());
            repocar.setModel(car.getModel());
            repocar.setColor(car.getColor());
            carRepository.save(repocar);
            }
            else {
                throw new CarNotFoundException();
            }
    }
}

