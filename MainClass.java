package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class MainClass {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
	Student s=context.getBean("std",Student.class);
	System.out.println(s);
	}

}
