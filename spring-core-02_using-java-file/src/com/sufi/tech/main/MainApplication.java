package com.sufi.tech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sufi.tech.beans.Student;
import com.sufi.tech.config.AppConfig;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		   Student std = context.getBean(Student.class);
             std.display();
	}

}
