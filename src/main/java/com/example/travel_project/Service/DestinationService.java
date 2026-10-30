package com.example.travel_project.Service;

import com.example.travel_project.Repository.DestinationRepository;

import com.example.travel_project.dto.DestinationDetailsDto;
import com.example.travel_project.entity.Attraction;
import com.example.travel_project.entity.Destination;
import com.example.travel_project.dto.DestinationDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public Page<DestinationDto> retrievePageData(String searchDestination, int page, int size, String sortfield, String sortdir) {

        Page<Destination> destinationPage;
        Sort sort = sortdir.equalsIgnoreCase("asc")?Sort.by(sortfield).ascending():Sort.by(sortfield).descending();
        Pageable pageable = PageRequest.of( page, size, sort);
        if(searchDestination==null || searchDestination.isBlank()){
            destinationPage = destinationRepository.findAll(pageable);
        }
        else {
            destinationPage = destinationRepository.findByDestinationName(searchDestination,pageable);
        }
        return destinationPage.map(d -> new DestinationDto(
                d.getDestinationId(),
                d.getDestinationName(),
                d.getTagline(),
                d.getImageUrl(),
                d.getRating()));
    }

    @Transactional(readOnly = true)
    public DestinationDetailsDto retrieveDestinationDetails(Long destinationId) {
        Optional<Destination> destinationoptional = destinationRepository.findById(destinationId);
        Destination destination = destinationoptional.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Destination is not found with the id"+destinationId));
        List list=new ArrayList();
        if(destination.getAttractions()!=null && !destination.getAttractions().isEmpty()) {
            for (Attraction attraction : destination.getAttractions()) {
                if (attraction != null || attraction.getAttractionName()!=null) {
                    list.add(attraction.getAttractionName());
                }
            }
        }
        return new DestinationDetailsDto(
                destination.getDestinationId(),
                destination.getDestinationName(),
                destination.getState(),
                destination.getDescription(),
                destination.getBestTimeToVisit(),
                destination.getWeather(),
                destination.getFamousFor(),
                list);
    }
}
