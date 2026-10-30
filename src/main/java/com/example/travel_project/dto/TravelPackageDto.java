package com.example.travel_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelPackageDto {

    private Long packageId;
    private String packageName;
    private Integer durationDays;
    private Integer durationNights;
    private Double price;
    private String accommodation;
    private String transportation;
    private String meals;
    private String activities;
    private String imageUrl;
    private Long destinationId;
}
