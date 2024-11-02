package com.ignitec.place_service.repositories;

import com.ignitec.place_service.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
