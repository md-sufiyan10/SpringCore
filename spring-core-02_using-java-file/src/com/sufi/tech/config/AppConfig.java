package com.sufi.tech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sufi.tech.beans.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student stuId() {
		Student s=new Student();
		s.setId(12);
		s.setName("Sufiyan Khan");
		s.setAddress("Noida Sector");
		return s;
	}
}
