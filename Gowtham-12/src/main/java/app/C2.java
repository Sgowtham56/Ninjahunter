package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C2 {
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@GetMapping("/home")
	public String login() {
		return "home";
	}

}