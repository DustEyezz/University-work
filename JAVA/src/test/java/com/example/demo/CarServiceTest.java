package com.example.demo;

import com.example.demo.car.Car;
import com.example.demo.controller.CarController;
import com.example.demo.exception.CarNotFoundException;
import com.example.demo.service.CarRepository;
import com.example.demo.service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;

@WebMvcTest(CarController.class)
public class CarControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CarService carService;

    @Test
    public void getCarReturnsCar() throws Exception, CarNotFoundException{
        Car testCar = new Car("bmw", "e45", "red", 2L);
        when(carService.getCarFromRepository("2")).thenReturn(testCar);

        mvc.perform(MockMvcRequestBuilders.get("/car/2")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("{'make':'bmw','model':'e45','color':'red','id':2}"));
    }
}
