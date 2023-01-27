package Week2E1.HelloThymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloThymeleafController {

	@GetMapping("hello")
	public String sayGreetings(@RequestParam(name="name") String name, 
			@RequestParam(name="age") String age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
	
}
