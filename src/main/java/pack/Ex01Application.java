package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ex01Application {
	@GetMapping("/")
	public String hello(){
		return "Hello World: finish 1006";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
	}
}
