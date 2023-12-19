package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
		Teacher teacher = (Teacher) applicationContext.getBean("myTeacher");
        teacher.printDetails();
	}

}