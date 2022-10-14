package com.magneto.learnspringboot.courses.bean;

public class Course {
	
	private int id;
	private String name;
	private String resource;
	
	public Course(int id, String name, String resource) {
		super();
		this.id = id;
		this.name = name;
		this.resource = resource;
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setResource(String resource) {
		this.resource = resource;
	}



	public String getName() {
		return name;
	}



	public String getResource() {
		return resource;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", resource=" + resource + "]";
	}
	
}
