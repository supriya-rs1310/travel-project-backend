package com.example.travel_project.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "destinations")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destinationId;

    @NotBlank(message = "Destination name is required")
    private String destinationName;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "tagline field is required")
    private String tagline;

    @NotBlank(message = "Description is required")
    @Size(max = 1000,message = "Description cannot exceed 1000 characters")
    private String description;

    @NotBlank(message = "Image URL is required")
    private String imageUrl;

    @NotBlank(message = "Weather information is required")
    private String weather;

    @NotBlank(message = "Best time to visit is required")
    private String bestTimeToVisit;

    @DecimalMin(value = "1.0",message = "Rating must be at least 1.0")
    @DecimalMax(value = "5.0",message = "Rating cannot exceed 5.0")
    private Double rating;

    @NotBlank(message = "Famous for field is required")
    private String famousFor;

    @OneToMany(mappedBy = "destination", cascade = CascadeType.ALL)
    private List<Attraction> attractions;

    @OneToMany(mappedBy = "destination", cascade = CascadeType.ALL)
    private List<Wishlist> wishlistedBy;




}
