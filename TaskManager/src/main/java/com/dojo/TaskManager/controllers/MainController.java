package com.dojo.TaskManager.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.TaskManager.models.Task;
import com.dojo.TaskManager.services.TaskService;

@RestController
public class MainController {
	private final TaskService taskService;
	public MainController(TaskService taskService) {
		this.taskService = taskService;
	}
	@GetMapping("/")
	public String createTask(@Valid @ModelAttribute("task") Task task, Model model) {
		return "createTask.jsp";
	}
	

}
