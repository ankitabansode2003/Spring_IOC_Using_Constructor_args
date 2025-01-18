package com.beans;

public class Student {
	private int student_id;
	private String name;
	private int age;
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_id, String name, int age, String city) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
