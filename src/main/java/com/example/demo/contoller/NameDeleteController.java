package com.example.demo.contoller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameDeleteController {

    @DeleteMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> deleteNameInfo(@PathVariable("id") int id) {
	return ResponseEntity.ok(Map.of("Message!", "NamesInfo successfully deleted!!"));

    }
}
