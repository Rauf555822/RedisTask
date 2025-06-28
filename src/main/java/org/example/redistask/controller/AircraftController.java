package org.example.redistask.controller;

import lombok.RequiredArgsConstructor;
import org.example.redistask.model.Aircraft;
import org.example.redistask.service.AircraftService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aircraft")
public class AircraftController {
    private final AircraftService aircraftService;

    @GetMapping("/getAll")
    public Iterable<Aircraft> getAll() {return aircraftService.getAll();}

    @PostMapping("/save")
    public Aircraft save (@RequestBody Aircraft aircraft) {return aircraftService.save(aircraft);}

    @GetMapping("/getById/{id}")
    public Optional <Aircraft> getById(@PathVariable String id) {return aircraftService.getById(id);}

    @DeleteMapping("/delete")
    public void delete (@RequestParam String id) {aircraftService.deleteById(id);}
}
