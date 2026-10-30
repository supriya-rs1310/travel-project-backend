package com.example.travel_project.Repository;


import com.example.travel_project.entity.TravelPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelPackageRepository extends JpaRepository<TravelPackage, Long> {


    @Query("SELECT tp FROM TravelPackage tp WHERE tp.destination.destinationId = :destinationId")
    List<TravelPackage> findByDestinationId(@Param("destinationId") Long destinationId);
    //List<TravelPackage> findByDestinationId(Long destination);
}
