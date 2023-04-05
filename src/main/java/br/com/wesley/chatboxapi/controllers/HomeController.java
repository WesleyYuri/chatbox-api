package br.com.wesley.chatboxapi.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.wesley.chatboxapi.models.UsersModel;
import br.com.wesley.chatboxapi.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@RestController
public class HomeController {
    private final UserRepository userRepository;

    @GetMapping("/people")
    public ResponseEntity people(){
        return ResponseEntity.ok(this.userRepository.findAll());
    }

    @PostMapping("/people")
    public UsersModel newPessoa(@RequestBody UsersModel newUser) {
        return this.userRepository.save(newUser);
    }
}
