package com.example.JenController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenController {
	
	@GetMapping("/")
	public String hele() {
		System.out.println("Helo JEn");
		return "HElo JEn123";
	}

}
