package org.example.redistask.repository;

import org.example.redistask.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, String> {
}
