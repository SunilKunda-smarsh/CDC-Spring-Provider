package com.smarsh.cdcservice.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CDCController {

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<String>> createUser(@PathVariable Integer userId) {
        List<String> body = Arrays.asList("apple"+userId, "orange"+userId);
        return ResponseEntity.status(201).body(body);
    }
}
