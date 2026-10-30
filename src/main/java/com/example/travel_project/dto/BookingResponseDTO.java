package com.example.travel_project.dto;
import com.example.travel_project.entity.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponseDTO {

private Long bookingId;

private String bookingReference;

private LocalDate travelDate;

private Integer travellersCount;

private Double totalAmount;

private BookingStatus bookingStatus;

private LocalDateTime bookingDate;

private String packageName;

}
