package com.example.travel_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishlistDTO {

     private Long wishlistId;

    private Long userId;

    private Long destinationId;

    private String destinationName;

    private String tagline;

    private Double rating;

    private String imageUrl;


}


