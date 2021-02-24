package idv.yu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping(value = {"/","/login"})
	public String login() {
		return "login";
	}
}
