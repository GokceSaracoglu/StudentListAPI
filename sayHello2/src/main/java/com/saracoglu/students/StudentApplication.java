package com.saracoglu.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//framework bu işi autowired ile yapmasaydı controller instanceları için service tanımlamaları manuel olarak yapılması gerekirdi.

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}
