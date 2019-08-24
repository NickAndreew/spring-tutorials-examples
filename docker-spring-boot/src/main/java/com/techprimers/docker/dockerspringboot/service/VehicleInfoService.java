package com.techprimers.docker.dockerspringboot.service;

import com.techprimers.docker.dockerspringboot.model.Vehicle;

import java.util.Arrays;
import java.util.List;


public class VehicleInfoService {

    public VehicleInfoService() {
    }

    public List<Vehicle> getBasicVehiclesList(){
        return Arrays.asList(
                new Vehicle("Benz", "B330", 1992),
                new Vehicle("BMW", "375-600-500-1000-600", 2919),
                new Vehicle("Zundap", "The Tremendous", 2201),
                new Vehicle("Pueed", "Superpussious", 3000)
        );
    }
}
