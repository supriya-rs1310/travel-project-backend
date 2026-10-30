package com.example.travel_project.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "travel_packages")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TravelPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;

    @NotBlank(message = "Package name is required")
    private String packageName;

    @Positive(message = "Duration days must be greater than 0")
    private Integer durationDays;

    @PositiveOrZero(message = "Duration nights cannot be negative")
    private Integer durationNights;

    @Positive(message = "Price must be greater than 0")
    private Double price;

    @NotBlank(message = "Accommodation details are required")
    private String accommodation;

    @NotBlank(message = "Transportation details are required")
    private String transportation;

    @NotBlank(message = "Meals details are required")
    private String meals;

    @NotBlank(message = "Activities details are required")
    private String activities;

    @NotBlank(message = "Image URL is required")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    @NotNull(message = "Destination is required")
    private Destination destination;

}
