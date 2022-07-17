package com.example.demo.contoller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.NamesInfo;

@RestController
public class NameGetController {

    @GetMapping("/names")
    public List<NamesInfo> getNameInfo(
	    @RequestParam(name = "NamesInfo", value = "NamesInfo", required = true) String NamesInfo) {
	return List.of(new NamesInfo("Sniff", 10), new NamesInfo("Snufkin", 20), new NamesInfo("Little My", 30),
		new NamesInfo("Groke", 40));

    }
}
