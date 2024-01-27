package org.interface11.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ProductController {
	@GetMapping("/welcome")
	public String getMessage() {
		return"Welcome to Interface11 Product Application";
	}

}
