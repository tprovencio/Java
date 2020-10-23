package com.dojo.ideas.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojo.ideas.models.Idea;
import com.dojo.ideas.models.User;
import com.dojo.ideas.services.IdeaService;
import com.dojo.ideas.services.UserService;
import com.dojo.ideas.validator.UserValidator;

@Controller
public class IdeasController {
	private final IdeaService ideaService;
	
	private final UserService userService;
	
	private final UserValidator userValidator;
	
	public IdeasController(IdeaService ideaService, UserValidator userValidator, UserService userService) {
		this.ideaService = ideaService;
		this.userValidator = userValidator;
		this.userService = userService;
	}
	
	@RequestMapping("/ideas")
	public String index(Model model) {
		List<Idea> ideas= ideaService.allIdeas();
		model.addAttribute("ideas",ideas);
		return "/content/ideas.jsp";
	}
	
	@RequestMapping("/ideas/new")
	public String newIdea (HttpSession session, Model model) {
		 Long userId=(Long) session.getAttribute("userId");
		 System.out.println(userId);
		 User user=userService.findUserById(userId);
		 model.addAttribute("user",user.getEmail());
		return "/content/new.jsp";
	}
	
	@PostMapping("/ideas")
	public String create(@RequestParam("name")String name,@RequestParam("creator")String creator) {
		
		Idea idea=new Idea();
		
				
		 
			idea=ideaService.createIdea(idea);
			idea.setName(name);
			idea.setCreator(creator);
			ideaService.createIdea(idea);
			return "redirect:/ideas";
		}

	
	@RequestMapping("/ideas/{id}/edit")
	public String edit(@PathVariable("id")Long id, Model model) {
		Idea idea = ideaService.findIdea(id);
		model.addAttribute("idea",idea);
		return "/content/edit.jsp";
	}
	
	@PutMapping("ideas/{id}")
	public String update(@Valid @ModelAttribute("idea")Idea idea, BindingResult result) {
		if (result.hasErrors()) {
			return "/content/edit.jsp";
		} else {
			ideaService.createIdea(idea);
			return "redirect:/ideas";
		}
	}
	@RequestMapping(value="/ideas/{id}",method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id")Long id) {
		ideaService.delete(id);
		return "redirect:/ideas";
	}
	
	@RequestMapping("ideas/{id}")
	public String show(Model model, @PathVariable("id")Long id, @Valid @ModelAttribute("idea")Idea idea, BindingResult result) {
		model.addAttribute("idea",ideaService.findIdea(id));
		return "/content/show.jsp";
	}
	
	

}
