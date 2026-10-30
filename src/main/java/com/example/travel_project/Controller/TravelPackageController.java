package com.example.travel_project.Controller;


import com.example.travel_project.Service.TravelPackageService;
import com.example.travel_project.dto.TravelPackageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/travelPackages")
public class TravelPackageController {

    @Autowired
    private TravelPackageService travelPackageService;

    //http://localhost:8080/travelPackages/PackagesList
    @GetMapping("/PackagesList")
    public ResponseEntity<List<TravelPackageDto>> packagesList(@RequestParam("destination") Long destination) {
        List<TravelPackageDto> list = travelPackageService.packageList(destination);
        return ResponseEntity.ok(list);
    }
}
