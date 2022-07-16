package com.example.demo.contoller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.form.UpdateForm;

@RestController
public class NamePatchController {

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> updateNameInfo(@PathVariable("id") int id,
	    @Validated @RequestBody UpdateForm form) {
	return ResponseEntity.ok(Map.of("Message", "NameInfo successfully updated"));
    }
}
