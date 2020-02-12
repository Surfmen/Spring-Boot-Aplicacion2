package es.peonadas.aplicacionspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.peonadas.aplicacionspring.entity.User;
import es.peonadas.aplicacionspring.repository.RoleRepository;
import es.peonadas.aplicacionspring.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserService userService;
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}

	@GetMapping("/userform")
	public String getUserForm(Model modelo) {
		modelo.addAttribute("userForm", new User());
		modelo.addAttribute("roles", roleRepository.findAll());
		modelo.addAttribute("userList", userService.getAllUsers());
		modelo.addAttribute("listTab","active");
		return "user-form/user-view";
	}
}
