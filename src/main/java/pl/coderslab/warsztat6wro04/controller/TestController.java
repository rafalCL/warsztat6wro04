package pl.coderslab.warsztat6wro04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.warsztat6wro04.entity.User;
import pl.coderslab.warsztat6wro04.repository.UserRepository;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/adduser")
	@ResponseBody
	public String adduser() {
		User user = new User();
		this.userRepository.save(user);
		return "dodano usera";
	}
}
