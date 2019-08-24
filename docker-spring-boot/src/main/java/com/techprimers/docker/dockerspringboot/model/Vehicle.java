package com.techprimers.docker.dockerspringboot.model;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String make;
    private String model;
    private Integer year;

    public Vehicle(){
        super();
    }

    public Vehicle(String make, String model, Integer year) {
        super();
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Vehicle withMake(String make){
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle withModel(String model){
        this.model = model;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Vehicle withYear(Integer year){
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
