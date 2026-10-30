package com.example.travel_project.Service;


import com.example.travel_project.Repository.DestinationRepository;
import com.example.travel_project.Repository.UserRepository;
import com.example.travel_project.Repository.WishlistRepository;
import com.example.travel_project.dto.WishlistDTO;
import com.example.travel_project.entity.Destination;
import com.example.travel_project.entity.User;
import com.example.travel_project.entity.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DestinationRepository destinationRepository;

    // 1. addToWishlist()
    public void addToWishlist(Long userId, Long destinationId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Destination destination = destinationRepository.findById(destinationId)
                .orElseThrow(() -> new RuntimeException("Destination not found"));

        Optional<Wishlist> existingWishlist =
                wishlistRepository.findByUser_UserIdAndDestination_DestinationId(userId,destinationId);

        if (existingWishlist.isPresent()) {
            throw new RuntimeException("Destination already exists in wishlist");
        }

        Wishlist wishlist = new Wishlist();

        wishlist.setUser(user);
        wishlist.setDestination(destination);
        wishlist.setAddedDate(LocalDateTime.now());

        wishlistRepository.save(wishlist);
    }

    // 2. getWishlistByUserId()
    public List<WishlistDTO> getWishlistByUserId(Long userId) {

        return wishlistRepository.findByUser_UserId(userId)
                .stream()
                .map(wishlist -> new WishlistDTO(
                        wishlist.getWishlistId(),
                        wishlist.getUser().getUserId(),
                        wishlist.getDestination().getDestinationId(),
                        wishlist.getDestination().getDestinationName(),
                        wishlist.getDestination().getTagline(),
                        wishlist.getDestination().getRating(),
                        wishlist.getDestination().getImageUrl()
                ))
                .toList();
    }

    // 3. removeFromWishlist()
    public void removeFromWishlist(Long wishlistId) {

        Wishlist wishlist = wishlistRepository.findById(wishlistId)
                .orElseThrow(() -> new RuntimeException("Wishlist item not found"));

        wishlistRepository.delete(wishlist);
    }
}