package com.techprimers.docker.dockerspringboot.controller;

import com.techprimers.docker.dockerspringboot.model.Vehicle;
import com.techprimers.docker.dockerspringboot.service.VehicleInfoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController("/")
public class AppMainController {

    private final Logger LOG = LoggerFactory.getLogger(AppMainController.class);
    private final VehicleInfoService service = new VehicleInfoService();

    @GetMapping("vehicles")
    protected ModelAndView getVehicles(ModelAndView model) {
        LOG.info("ROUTE ONE!");
        List<Vehicle> vehicles = service.getBasicVehiclesList();

        model = new ModelAndView("vehiclesPage");
        model.addObject("vehicles", vehicles);

        return model;
    }

}
