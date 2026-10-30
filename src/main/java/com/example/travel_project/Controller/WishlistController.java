package com.example.travel_project.Controller;


import com.example.travel_project.Service.WishlistService;
import com.example.travel_project.dto.WishlistDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    // http://localhost:8080/api/wishlist/add
    @PostMapping("/add")
    public ResponseEntity<?> addToWishlist(@RequestBody WishlistDTO request) {

            wishlistService.addToWishlist(request.getUserId(), request.getDestinationId());
            //return new ResponseEntity<>("Destination added successfully", HttpStatus.OK);
        return new ResponseEntity<>(Map.of("message", "Destination added successfully"), HttpStatus.OK);
        
    }

    // http://localhost:8080/api/wishlist/user/userId?userId=1
    @GetMapping("/user/userId")
    public ResponseEntity<?> getWishlistByUserId(@RequestParam Long userId) {
            return new ResponseEntity<>(wishlistService.getWishlistByUserId(userId), HttpStatus.OK);
    }

    // http://localhost:8080/api/wishlist/remove/wishlistId?wishlistId=1
    @DeleteMapping("/remove/wishlistId")
    public ResponseEntity<?> removeFromWishlist(@RequestParam Long wishlistId) {
            wishlistService.removeFromWishlist(wishlistId);
            //return new ResponseEntity<>("Destination removed successfully", HttpStatus.OK);
        return new ResponseEntity<>(Map.of("message", "Destination removed successfully"), HttpStatus.OK);
    }
}