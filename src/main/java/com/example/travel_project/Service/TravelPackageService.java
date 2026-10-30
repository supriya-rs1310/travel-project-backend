package com.example.travel_project.Service;

import com.example.travel_project.Repository.TravelPackageRepository;
import com.example.travel_project.dto.TravelPackageDto;
import com.example.travel_project.entity.TravelPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
public class TravelPackageService {

    @Autowired
    private TravelPackageRepository travelPackageRepository;

    @Transactional(readOnly = true)
    public List<TravelPackageDto> packageList(Long destination) {
        List<TravelPackage> entityData = travelPackageRepository.findByDestinationId(destination);
        List<TravelPackageDto> list = new ArrayList<>();

        for (TravelPackage pkg : entityData) {
            list.add(new TravelPackageDto(
                    pkg.getPackageId(),
                    pkg.getPackageName(),
                    pkg.getDurationDays(),
                    pkg.getDurationNights(),
                    pkg.getPrice(),
                    pkg.getAccommodation(),
                    pkg.getTransportation(),
                    pkg.getMeals(),
                    pkg.getActivities(),
                    pkg.getImageUrl(),
                    pkg.getDestination()!=null ? pkg.getDestination().getDestinationId() : null) );
        }
        return list;
    }
}
