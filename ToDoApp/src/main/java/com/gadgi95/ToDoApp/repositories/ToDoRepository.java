package com.gadgi95.ToDoApp.repositories;

import com.gadgi95.ToDoApp.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
