package com.example.demo.contoller;

import java.net.URI;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.form.CreateForm;

@RestController
public class NamePostController {

    @PostMapping("/names")
    public ResponseEntity<Map<String, String>> createNameInfo(@RequestBody @Validated CreateForm form) {
	URI url = UriComponentsBuilder.fromUriString("http://localhost:8080").path("/names/id").build().toUri();
	return ResponseEntity.created(url).body(Map.of("Message", "NameInfo successfully created"));
    }
}
