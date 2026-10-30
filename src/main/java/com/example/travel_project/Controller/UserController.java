package com.example.travel_project.Controller;

import com.example.travel_project.Service.UserService;
import com.example.travel_project.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/users")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
    @Autowired
    public UserService userService;

    //http://localhost:8080/users/all
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();

        return ResponseEntity.ok(users);

    }

    //http://localhost:8080/users/register
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
            User registeredUser = userService.registerUser(user);
            return new ResponseEntity(registeredUser, HttpStatus.CREATED); 
    }


    //http://localhost:8080/users/Login
    @PostMapping("/Login")
    public ResponseEntity<?> loginUser(@RequestBody User user1) {
            User loginedUser = userService.loginUser(user1);
            return new ResponseEntity(loginedUser, HttpStatus.OK);
    }



    //http://localhost:8080/users/change-password
    @PutMapping("/change-password")
     public ResponseEntity<?> changePassword(@RequestBody Map<String, String> request) {
    userService.changePassword(request.get("email"), request.get("oldPassword"), request.get("newPassword"));
        return new ResponseEntity<>(Map.of("message", "Password changed successfully"), HttpStatus.OK);
   
    }


    //http://localhost:8080/users/id?id=1
    @GetMapping("/id")
    public ResponseEntity<User> getUserById(@RequestParam Long id) {
        User user=userService.getUserById(id);
        return new ResponseEntity(user,HttpStatus.OK);
    }
}