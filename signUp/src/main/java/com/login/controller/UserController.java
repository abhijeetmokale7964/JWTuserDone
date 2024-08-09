//package com.login.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.login.entities.User;
//import com.login.service.UserService;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//@RestController
//public class UserController {
//
//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/user")
//    public ResponseEntity<List<User>> getAllUsers() {
//        logger.trace("Entering getAllUsers method.");
//        List<User> list = userService.getAllUserList();
//
//        if (list.isEmpty()) {
//            logger.warn("No users found.");
//            return ResponseEntity.notFound().build();
//        }
//        logger.info("Found {} users.", list.size());
//        return ResponseEntity.ok(list);
//    }
//
//    @PostMapping("/user")
//    public ResponseEntity<User> addUser(@RequestBody User user) {
//        logger.trace("Entering addUser method with user: {}", user);
//        try {
//            User addedUser = userService.addUser(user);
//            logger.info("User added successfully with ID: {}", addedUser.getId());
//            return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
//        } catch (Exception e) {
//            logger.error("Error adding user: {}", e.getMessage(), e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//
//    @GetMapping("/user/{mail}/{pass}")
//    public ResponseEntity<User> getUser(@PathVariable("mail") String mail, @PathVariable("pass") String pass) {
//        logger.trace("Entering getUser method with mail: {} and pass: {}", mail, pass);
//        Optional<User> userOptional = Optional.ofNullable(userService.getUserByEmailAndPassword(mail, pass));
//
//        if (userOptional.isPresent()) {
//            logger.info("User found with mail: {}", mail);
//            return ResponseEntity.ok(userOptional.get());
//        } else {
//            logger.warn("User not found with mail: {}", mail);
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/user/{userId}")
//    public ResponseEntity<Void> deleteUser(@PathVariable("userId") int userId) {
//        logger.trace("Entering deleteUser method with userId: {}", userId);
//        try {
//            userService.deleteUser(userId);
//            logger.info("User deleted successfully with ID: {}", userId);
//            return ResponseEntity.noContent().build();
//        } catch (Exception e) {
//            logger.error("Error deleting user: {}", e.getMessage(), e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//
//    @PutMapping("/user/{userId}")
//    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("userId") int userId) {
//        logger.trace("Entering updateUser method with userId: {}", userId);
//        try {
//            userService.updateUser(user, userId);
//            logger.info("User updated successfully with ID: {}", userId);
//            return ResponseEntity.ok(user);
//        } catch (Exception e) {
//            logger.error("Error updating user: {}", e.getMessage(), e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//}
