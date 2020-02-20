package es.peonadas.aplicacionspring.controller;



import javax.validation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
=======
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> branch 'master' of https://github.com/Surfmen/Spring-Boot-Aplicacion2.git

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

	@GetMapping("/userForm")
	public String getUserForm(Model modelo) {
		modelo.addAttribute("userForm", new User());
		modelo.addAttribute("userList", userService.getAllUsers());
		modelo.addAttribute("roles", roleRepository.findAll());
		modelo.addAttribute("listTab","active");
		return "user-form/user-view";
	}
	
	@PostMapping("/userForm")
<<<<<<< HEAD
	public String createUser(@Valid @ModelAttribute("userForm")User user,BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			model.addAttribute("userForm", user);
			model.addAttribute("formTab","active");
		}else {
			try {
				//Aca tendras error porque este metodo no existe, pero lo crearemos en la siguiente seccion.
				userService.createUser(user);
				model.addAttribute("userForm", new User());
				model.addAttribute("listTab","active");
			}catch(Exception e) {
				model.addAttribute("formErrorMessage",e.getMessage());
				model.addAttribute("userForm", user);
				model.addAttribute("formTab","active");
				model.addAttribute("userList", userService.getAllUsers());
				model.addAttribute("roles",roleRepository.findAll());
			}
			
		}
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());
		return "user-form/user-view";
	}
	
	// con Get optenemos el formulario
	@GetMapping("/editUser/{id}")
	public String getEditUserForm(Model model,@PathVariable(name="id") Long id) throws Exception{
		User userToEdit = userService.getUserById(id);
		
		model.addAttribute("userForm", userToEdit);
		model.addAttribute("userList",userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());		
		model.addAttribute("formTab", "active");
		//Activa el tab del formulario.
		model.addAttribute("editMode","true");
		
		return "user-form/user-view";
	}
	
	//con Post accemos la hacion
	@PostMapping("/editUser")
	public String postEditUser(@Valid @ModelAttribute("userForm")User user,BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			model.addAttribute("userForm", user);
			model.addAttribute("formTab","active");
			model.addAttribute("editMode","true");
		}else {
			try {
				//Aca tendras error porque este metodo no existe, pero lo crearemos en la siguiente seccion.
				userService.updateUser(user);
				model.addAttribute("userForm", new User());
				model.addAttribute("listTab","active");
			}catch(Exception e) {
				model.addAttribute("formErrorMessage",e.getMessage());
				model.addAttribute("userForm", user);
				model.addAttribute("formTab","active");
				model.addAttribute("userList", userService.getAllUsers());
				model.addAttribute("roles",roleRepository.findAll());
				model.addAttribute("editMode","true");
			}
			
		}
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());
		return "user-form/user-view";
		
	}
	
	@GetMapping("/editUser/cancel")
	public String cancelEditUser(ModelMap model) {
		return "redirect:/userForm";
=======
	public String createUser(@Valid final @ModelAttribute("userForm")User user,final BindingResult result,final ModelMap model) {
		if(result.hasErrors()) {
			model.addAttribute("userForm", user);
			model.addAttribute("formTab","active");
		}else {
			try {
				//Aca tendras error porque este metodo no existe, pero lo crearemos en la siguiente seccion.
				userService.createUser(user);
				model.addAttribute("userForm", new User());
				model.addAttribute("listTab","active");
			}catch(Exception e) {
				model.addAttribute("formErrorMessage",e.getMessage());
				model.addAttribute("userForm", user);
				model.addAttribute("formTab","active");
				model.addAttribute("userList", userService.getAllUsers());
				model.addAttribute("roles",roleRepository.findAll());
			}
			
		}
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());
		return "user-form/user-view";
>>>>>>> branch 'master' of https://github.com/Surfmen/Spring-Boot-Aplicacion2.git
	}
}
