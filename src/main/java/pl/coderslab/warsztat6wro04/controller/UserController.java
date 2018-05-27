package pl.coderslab.warsztat6wro04.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.warsztat6wro04.entity.User;
import pl.coderslab.warsztat6wro04.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/register")
	public String register(Model model) {
		User userData = new User();
		model.addAttribute("userData", userData);
		
		return "user/register";
	}
	
	@PostMapping("/register")
	public String registerPost(@Valid @ModelAttribute("userData") User userData, BindingResult br, Model model) {
		if(br.hasErrors()) {
			return "user/register";
		}
		
		this.userRepository.save(userData);
		
		return "redirect:/";
	}
}
