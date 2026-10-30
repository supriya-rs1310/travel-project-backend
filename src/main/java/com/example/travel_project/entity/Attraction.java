package com.example.travel_project.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attractions")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attractionId;

    @NotBlank(message = "Attraction name is required")
    private String attractionName;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    @NotNull(message = "Destination is required")
    private Destination destination;

}