package com.example.travel_project.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinationDto {
    private Long destinationId;
    private String destinationName;
    private String tagline;
    private String imageUrl;
    private Double rating;
}
