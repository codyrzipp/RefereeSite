package site.referee.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import site.referee.backend.model.User;
import site.referee.backend.repository.IUserRepository;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
