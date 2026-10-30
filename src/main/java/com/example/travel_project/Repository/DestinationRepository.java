package com.example.travel_project.Repository;

import com.example.travel_project.entity.Destination;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {
    Page<Destination> findByDestinationName(String searchDestination, Pageable pageable);


}
