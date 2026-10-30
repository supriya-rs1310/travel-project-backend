package com.example.travel_project.Controller;

import com.example.travel_project.Service.DestinationService;
import com.example.travel_project.dto.DestinationDetailsDto;
import com.example.travel_project.dto.DestinationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destinations")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    //http://localhost:8080/destinations/popularDestinations
    @GetMapping("/popularDestinations")
    public ResponseEntity<Page<DestinationDto>> retrievePageData(@RequestParam(required = false) String searchDestination,
                                                                 @RequestParam(defaultValue = "0") int page,
                                                                 @RequestParam(defaultValue = "5")int size,
                                                                 @RequestParam(defaultValue = "destinationName") String sortfield,
                                                                 @RequestParam(defaultValue = "asc")String sortdir) {

        Page<DestinationDto> destinationDtoPage = destinationService.retrievePageData(searchDestination,page,size,sortfield,sortdir);
        return ResponseEntity.ok(destinationDtoPage);
    }


    //http://localhost:8080/destinations/destinationDetails
    @GetMapping("/destinationDetails")
    public ResponseEntity<DestinationDetailsDto> listDestDetails(@RequestParam Long destinationId) {
        DestinationDetailsDto destinationDetailsData = destinationService.retrieveDestinationDetails(destinationId);
        return ResponseEntity.ok(destinationDetailsData);
    }
}
