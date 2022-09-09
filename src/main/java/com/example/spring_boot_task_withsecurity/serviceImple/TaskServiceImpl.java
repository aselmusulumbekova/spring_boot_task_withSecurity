package com.example.spring_boot_task_withsecurity.serviceImple;

import com.example.spring_boot_task_withsecurity.entity.Task;
import com.example.spring_boot_task_withsecurity.repositoryImpl.repository.TaskRepository;
import com.example.spring_boot_task_withsecurity.serviceImple.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
    private final TaskRepository repository;

    @Autowired
    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveTask(int lessId, Task task) {
        repository.saveTask(lessId,task);
    }

    @Override
    public void updateTask(int id, Task task) {
        repository.updateTask(id, task);
    }

    @Override
    public Task getTaskById(int id) {
        return repository.getTaskById(id);
    }

    @Override
    public List<Task> getAllTasks(int id) {
        return repository.getAllTasks(id);
    }

    @Override
    public void deleteTaskById(int id) {
        repository.deleteTaskById(id);
    }
}
