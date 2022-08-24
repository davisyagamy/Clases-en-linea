package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Task tarea1 = new Task("Apredender Java", false, LocalDate.of(2022,12,31) );


		System.out.println(tarea1.getDescription());

		tarea1.setDescription("Aprender Java y Desarrollo WEB");

		System.out.println(tarea1.getDescription());

		TaskList propositos = new TaskList("Propositos fin de año");

		propositos.addTask(tarea1);

		System.out.println(propositos.getTaskList().size());

		Task tarea2 = new Task("Apredender HTML", false, LocalDate.of(2022,12,31) );

		propositos.addTask(tarea2);

		System.out.println(propositos.getTaskList().size());


	}


}
