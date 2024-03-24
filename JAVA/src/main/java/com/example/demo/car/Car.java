package com.example.demo.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private long id;
    private String make;
    private String model;
    private String color;

    public Car (){}

    public Car(String make, String model, String color, Long id){
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
