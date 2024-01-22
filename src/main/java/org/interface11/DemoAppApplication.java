package org.interface11;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAppApplication {
	static Logger log=LoggerFactory.getLogger(DemoAppApplication.class);
	@Autowired
	private EmployeeRepo repo;
	@GetMapping("/")
	public String welcome() {
		String msg="Welcome to interface11...!";
	log.info("My First log",msg);
		//log.debug("Server is live on 8080");
		return msg;
	}
@PostMapping("/add")
public Employee addEmployee(@RequestBody Employee employee) {
	return repo.save(employee);
}
@GetMapping("/list")
public List<Employee> get(){
	return repo.findAll();
}

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
		
	}

}
