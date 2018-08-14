package hearter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class HearterApplication {

	@RequestMapping("/")
	String hello() {
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HearterApplication.class, args);
	}
}
