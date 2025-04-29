package com.sufi.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sufi.core.beans.Student;

public class Main {

	public static void main(String[] args) {
		String config_loca="/com/sufi/core/resources/applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loca);

		Student stu = (Student) context.getBean("stdId");
		stu.displaye();
		System.out.println("=========================");
		Student stu1 = (Student) context.getBean("stdId1");
		stu1.displaye();
	}

}
