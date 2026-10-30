package com.example.travel_project.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private String bookingReference;

    @Future(message = "Travel Date must be in future")
    private LocalDate travelDate;

    @Min(value = 1, message = "At least one traveller is required")
    private Integer travellersCount;

    @Positive(message = "Total amount must be greater than 0")
    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    private LocalDateTime bookingDate;

    @PrePersist
    public void prePersist() {
        this.bookingDate = LocalDateTime.now();
    }


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    //@NotNull(message = "User is required")
    private User user;


    @ManyToOne
    @JoinColumn(name = "package_id", nullable = false)
    //@NotNull(message = "Travel package is required")
    private TravelPackage travelPackage;


}

