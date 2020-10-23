package com.dojo.TaskManager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojo.TaskManager.models.Task;
import com.dojo.TaskManager.repositories.TaskRepository;

@Service
public class TaskService {
	private final TaskRepository taskRepo;
	
	public TaskService(TaskRepository taskRepo) {
		this.taskRepo = taskRepo;
	}
	public List<Task> allTasks() {
		return taskRepo.findAll();
	}
	public Task createTask(Task t) {
		return taskRepo.save(t);
	}
	
	public Task findTask(Long id) {
		Optional<Task> optionalTask = taskRepo.findById(id);
		if (optionalTask.isPresent()) {
			return optionalTask.get();
		} else {
			return null;
		}
	}

}
