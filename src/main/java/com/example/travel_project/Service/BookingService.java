package com.example.travel_project.Service;


import com.example.travel_project.Repository.BookingRepository;
import com.example.travel_project.Repository.TravelPackageRepository;
import com.example.travel_project.Repository.UserRepository;
import com.example.travel_project.dto.BookingRequestDTO;
import com.example.travel_project.dto.BookingResponseDTO;
import com.example.travel_project.entity.Booking;
import com.example.travel_project.entity.BookingStatus;
import com.example.travel_project.entity.TravelPackage;
import com.example.travel_project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TravelPackageRepository travelPackageRepository;



    // 1. createBooking()

   public BookingResponseDTO createBooking(BookingRequestDTO request) {

    User user = userRepository.findById(request.getUserId())
            .orElseThrow(() -> new RuntimeException("User not found"));

    TravelPackage travelPackage = travelPackageRepository.findById(request.getPackageId())
            .orElseThrow(() -> new RuntimeException("Package not found"));

    Booking booking = new Booking();

    booking.setTravelDate(request.getTravelDate());
    booking.setTravellersCount(request.getTravellersCount());

    booking.setTotalAmount(
            travelPackage.getPrice() * request.getTravellersCount()
    );

    booking.setBookingStatus(BookingStatus.PENDING);

    // Generate a unique booking reference number
    booking.setBookingReference("BK" + System.currentTimeMillis());

    booking.setUser(user);
    booking.setTravelPackage(travelPackage);

    Booking savedBooking = bookingRepository.save(booking);

    return new BookingResponseDTO(
            savedBooking.getBookingId(),
            savedBooking.getBookingReference(),
            savedBooking.getTravelDate(),
            savedBooking.getTravellersCount(),
            savedBooking.getTotalAmount(),
            savedBooking.getBookingStatus(),
            savedBooking.getBookingDate(),
            savedBooking.getTravelPackage().getPackageName()
    );
}

    // 2. getBookingsByUserId()

    public List<BookingResponseDTO> getBookingsByUserId(Long userId) {

    return bookingRepository.findByUser_UserId(userId)
            .stream()
            .map(booking -> new BookingResponseDTO(
                    booking.getBookingId(),
                    booking.getBookingReference(),
                    booking.getTravelDate(),
                    booking.getTravellersCount(),
                    booking.getTotalAmount(),
                    booking.getBookingStatus(),
                    booking.getBookingDate(),
                    booking.getTravelPackage().getPackageName()
            ))
            .toList();
}


    // 3. getBookingById()
    public BookingResponseDTO getBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId)
                .map(booking -> new BookingResponseDTO(
                        booking.getBookingId(),
                        booking.getBookingReference(),
                        booking.getTravelDate(),
                        booking.getTravellersCount(),
                        booking.getTotalAmount(),
                        booking.getBookingStatus(),
                        booking.getBookingDate(),
                        booking.getTravelPackage().getPackageName()
                ))
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        }


    // 4. cancelBooking()
    public void cancelBooking(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
                booking.setBookingStatus(BookingStatus.CANCELLED);
                bookingRepository.save(booking);
                
                
 

}
}

