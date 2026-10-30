package com.example.travel_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequestDTO {
private Long userId;
private Long packageId;
private LocalDate travelDate;
private Integer travellersCount;





}
