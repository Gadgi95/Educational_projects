package com.gadgi95.ToDoApp.controllers;


import com.gadgi95.ToDoApp.domain.ToDo;
import com.gadgi95.ToDoApp.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoControllers {
    private final ToDoService toDoService;

    @Autowired
    public ToDoControllers(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public <Todo> List<Todo> getAll() {
        return toDoService.getAll();
    }

    @PostMapping
    public ToDo create(@RequestBody ToDo toDo) {
        return toDoService.create(toDo);
    }

    @PutMapping
    public ToDo update(@RequestBody ToDo toDo) {
        return toDoService.update(toDo);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        toDoService.delete(id);
    }
}
