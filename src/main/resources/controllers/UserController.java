package controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/")
    public User postUser(@Valid @RequestBody User user){
        return userRepository.saveAndFlush(user);
    }

    @GetMapping("/all")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        return ReponseEntity.ok().build();
    }
}
