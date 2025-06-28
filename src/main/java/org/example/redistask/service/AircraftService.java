package org.example.redistask.service;

import lombok.RequiredArgsConstructor;
import org.example.redistask.model.Aircraft;
import org.example.redistask.repository.AircraftRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AircraftService {
    private final AircraftRepository aircraftRepository;

    public Iterable <Aircraft> getAll() {return aircraftRepository.findAll();}

    public Aircraft save (Aircraft aircraft) {return aircraftRepository.save(aircraft);}

    public Optional<Aircraft> getById(String id) {return aircraftRepository.findById(id);}

    public void deleteById(String id) {aircraftRepository.deleteById(id);}
}
