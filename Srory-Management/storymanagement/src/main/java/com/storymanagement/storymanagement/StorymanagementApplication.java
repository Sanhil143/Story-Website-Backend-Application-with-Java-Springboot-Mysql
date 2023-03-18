package com.storymanagement.storymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorymanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorymanagementApplication.class, args);
		System.out.println("Story-Management app running on port");
	}

}
