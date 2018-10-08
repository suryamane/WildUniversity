package com.university.bean;

public class Student {
	private String unumber;
	private String sex;
	private String name;
	//Constructor
	public Student(String unumber, String sex, String name) {
		super();
		this.unumber = unumber;
		this.sex = sex;
		this.name = name;
	}
	public String getUnumber() {
		return unumber;
	}
	public String getSex() {
		return sex;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [unumber=" + unumber + ", sex=" + sex + ", name=" + name + "]";
	}
	
	
}
