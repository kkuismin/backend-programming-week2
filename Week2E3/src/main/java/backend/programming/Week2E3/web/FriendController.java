package backend.programming.Week2E3.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import backend.programming.Week2E3.domain.Friend;

@Controller
public class FriendController {
	
	private ArrayList<Friend> friends = new ArrayList<>();

	@GetMapping(value = "/index")
	public String getFriendList(Model model) {
		model.addAttribute("friendlist", friends);
		model.addAttribute("friend", new Friend());
		return "friends";
	}
	
	@PostMapping("/index")
	public String submitFriend(@ModelAttribute Friend name, Model model) {
		friends.add(name);
		return "redirect:/index";
	}
}
