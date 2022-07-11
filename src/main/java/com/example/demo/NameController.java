package com.example.demo;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class NameController {

    @GetMapping("/names")
    public List<String> getName() {
	return List.of("Sniff", "Snufkin", "Little My", "Groke");

    }

    @PostMapping("/names")
    public ResponseEntity<String> createName(@RequestBody CreateForm form) {
	URI url = UriComponentsBuilder.fromUriString("http://localhost:8080").path("/names/id").build().toUri();
	return ResponseEntity.created(url).body("name successfully created");
    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> updateName(@PathVariable("id") int id, @RequestBody UpdateForm form) {
	return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> deleteName(@PathVariable("id") int id) {
	return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
    }
}
