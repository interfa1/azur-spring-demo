package org.interface11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAppApplication {
	@GetMapping("/")
	public String welcome() {
		return"Welcome to interface11...!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

}
