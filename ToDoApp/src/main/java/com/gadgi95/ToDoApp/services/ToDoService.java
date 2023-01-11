package com.gadgi95.ToDoApp.services;

import com.gadgi95.ToDoApp.domain.ToDo;
import com.gadgi95.ToDoApp.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private final ToDoRepository toDoRepository;

    @Autowired
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public <Todo> List<Todo> getAll() {
        return (List<Todo>) toDoRepository.findAll();
    }

    public ToDo create(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public ToDo update(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public void delete(Long id) {
        toDoRepository.deleteById(id);
    }

}
