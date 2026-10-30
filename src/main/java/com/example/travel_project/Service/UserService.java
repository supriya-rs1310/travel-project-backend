package com.example.travel_project.Service;


import com.example.travel_project.Repository.UserRepository;
import com.example.travel_project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;


    //getAllUsers()
   public List<User> getAllUsers(){
    return userRepo.findAll();
   }


 //Register User
 public User registerUser(User user) throws RuntimeException {


     user.setCreatedAt(LocalDateTime.now()); 
     user.setFullName(user.getFullName().trim());   // trim is used to remove the starting and ending spaces from the full name, email, password and phone number fields of the User object. This is important to ensure that the data stored in the database is clean and does not contain any unintended whitespace, which can cause issues with data integrity and user authentication.
     user.setPhoneNumber(user.getPhoneNumber().trim());
     user.setEmail(user.getEmail().trim());
     user.setPassword(user.getPassword().trim());
     
    // Check if email already exists
    if (userRepo.existsByEmail(user.getEmail().trim())) {
        throw new RuntimeException("Email already in use.");
    }
   return userRepo.save(user);
    
 }


 //loginUser()
   public User loginUser(User user1){
       user1.setEmail(user1.getEmail().trim());
       user1.setPassword(user1.getPassword().trim());

      User existingUser=userRepo.findByEmail(user1.getEmail());

      //check email
      if(existingUser==null || !existingUser.getPassword().equals(user1.getPassword())){
          throw new RuntimeException("Invalid Username or Password");
      }
      return existingUser;

   }


 //getUserById()
 public User getUserById(Long id){
    User user2=userRepo.findById(id).orElse(null);
    if(user2==null){
        throw new RuntimeException("User not found");
    }
    return user2;
 }

//  return userRepo.findById(id) //this is alternative to the above code
//        .orElseThrow(() ->
//            new RuntimeException(
//                "User not found"));
       


 //changePassword()
    public User changePassword(String email,String oldPassword,String newPassword){
        
    
        User user3=userRepo.findByEmail(email);
        if(email==null){
            throw new RuntimeException("User not found");
        }

        oldPassword=oldPassword.trim();
        newPassword=newPassword.trim();

        if(!user3.getPassword().equals(oldPassword)){
        throw new RuntimeException("Old Password Incorrect");
    }
    if(newPassword.isEmpty()){
        throw new RuntimeException("New Password cannot be empty");
    }

    if(newPassword.equals(oldPassword)){
        throw new RuntimeException("New Password cannot be the same as Old Password");
    }
    user3.setPassword(newPassword);

    return userRepo.save(user3);
}

}
