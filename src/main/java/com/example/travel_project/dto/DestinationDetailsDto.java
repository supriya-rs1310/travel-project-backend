package com.example.travel_project.dto;

import com.example.travel_project.entity.Attraction;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DestinationDetailsDto {
    private Long destinationId;
    private String destinationName;
    private String state;
    private String description;

    private String bestTimeToVisit;
    private String weather;
    private String famousFor;
    private List<Attraction> attractions;
}
