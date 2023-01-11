package com.gadgi95.ToDoApp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class ToDo {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    private String title;
    private boolean done;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ToDo(String s, boolean b) {
    }
}
