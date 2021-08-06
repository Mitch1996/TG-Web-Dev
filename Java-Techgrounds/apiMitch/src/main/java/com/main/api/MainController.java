package com.main.api;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class MainController{

    private String msg = "";

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<Student> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Student> getUsersById(@PathVariable(value = "id") Long userId)
            throws ResourceNotFoundException {
        Student user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));
        return ResponseEntity.ok().body(user);
    }
    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody Student user) {
        user.setCreated(LocalDate.now());
        userRepository.save(user);
        return ResponseEntity.ok("Added user :" + user.getFirstName());
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Student> updateUser(
            @PathVariable(value = "id") Long userId, @Valid @RequestBody Student userDetails)
            throws ResourceNotFoundException {

        Student user =
                userRepository
                        .findById(userId)
                        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));
        user.setEmail(userDetails.getEmail());
        user.setLastName(userDetails.getLastName());
        user.setFirstName(userDetails.getFirstName());
        user.setErvaring(userDetails.getErvaring());
        user.setSterren(userDetails.getSterren());
        System.out.println(LocalDate.now());
        final Student updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/users/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId) throws Exception {
        Student user =
                userRepository
                        .findById(userId)
                        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));

        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
