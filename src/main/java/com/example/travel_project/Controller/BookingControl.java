package com.example.travel_project.Controller;


import com.example.travel_project.Service.BookingService;
import com.example.travel_project.dto.BookingRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/bookings")
public class BookingControl {
  
    @Autowired
    private BookingService bookingService;

     // http://localhost:8080/api/bookings/create
    @PostMapping("/create")
    public ResponseEntity<?> createBooking(@RequestBody BookingRequestDTO request) {
            return new ResponseEntity<>(bookingService.createBooking(request), HttpStatus.CREATED);
    }


   // http://localhost:8080/api/bookings/user/userId?userId=1
    @GetMapping("/user/userId")
    public ResponseEntity<?> getBookingsByUserId(@RequestParam Long userId) {
       
            return new ResponseEntity<>(bookingService.getBookingsByUserId(userId), HttpStatus.OK);

    }

     // http://localhost:8080/api/bookings/bookingId?bookingId=1
     @GetMapping("/bookingId")
    public ResponseEntity<?> getBookingById(@RequestParam Long bookingId) {
       
            return new ResponseEntity<>(bookingService.getBookingById(bookingId), HttpStatus.OK);
        
    }



     // http://localhost:8080/api/bookings/cancel?bookingId=1
    @PutMapping("/cancel")

    public ResponseEntity<?> cancelBooking(@RequestParam Long bookingId) {

            bookingService.cancelBooking(bookingId);
            //return new ResponseEntity<>("Booking cancelled successfully", HttpStatus.OK);
        return new ResponseEntity<>(Map.of("message", "Booking cancelled successfully"), HttpStatus.OK);
    }
}
