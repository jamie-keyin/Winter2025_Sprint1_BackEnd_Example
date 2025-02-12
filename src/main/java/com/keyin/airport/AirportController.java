package com.keyin.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping("/airports")
    public List<Airport> getAllAirports() {
        return airportService.findAllAirports();
    }

    @GetMapping("/airport/{id}")
    public Airport getAirportByID(@PathVariable long id) {
        return airportService.findAirportById(id);
    }

    @PostMapping("/airport")
    public Airport createAirport(@RequestBody Airport newAirport) {
        return airportService.createAirport(newAirport);
    }

    @PutMapping("/airport/{id}")
    public Airport updateAirport(@PathVariable long id, @RequestBody Airport updatedAirport) {
        return airportService.updateAirport(id, updatedAirport);
    }
}
