package edu.mikita.dk_user_api.controller;

import edu.mikita.dk_user_api.domain.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestControllerV1 {

    @GetMapping
    public ResponseEntity<List<?>> getUsers() throws InterruptedException {
        Thread.sleep(2000);
        var dto1 = new UserDto(1, "John", "Wick", "john.wick@gmail.com");
        var dto2 = new UserDto(2, "Mike", "Smith", "mike.smith@gmail.com");
        List<?> users = List.of(dto1, dto2);
        return ResponseEntity.ok(users);
    }
}

