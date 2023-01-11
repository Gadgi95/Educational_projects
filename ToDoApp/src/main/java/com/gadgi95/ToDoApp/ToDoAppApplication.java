package com.gadgi95.ToDoApp;

import com.gadgi95.ToDoApp.domain.ToDo;
import com.gadgi95.ToDoApp.repositories.ToDoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ToDoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoAppApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(ToDoAppApplication.class);
	@Bean
	public CommandLineRunner demo(ToDoRepository repository) {
		return (args) -> {
			// save a few todo which already have done

			repository.save(new ToDo("Проснуться в 7:00", true));
			repository.save(new ToDo("Завтрак в 7:30", true));

			//fetch all Todo
			log.info("ToDo found with findAll");
			log.info("______________________________");
			for(ToDo toDo : repository.findAll()){
				log.info(toDo.toString());
			}
			log.info("");
		};
	}
}
