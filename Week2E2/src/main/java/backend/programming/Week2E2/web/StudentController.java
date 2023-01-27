package backend.programming.Week2E2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import backend.programming.Week2E2.domain.Student;

@Controller
public class StudentController {

	@GetMapping("hello")
	public String studentGreetings(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Matti", "Meikäläinen"));
		students.add(new Student("Maija", "Meikäläinen"));
		model.addAttribute("students", students);
		return "hello";
	}
	
}
