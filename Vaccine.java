package com.mkce.springbootbasics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vacc")
public class Vaccine {

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "vaccine [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccine(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	@Id
	private Long id;
	private String name;
	private int age;
	

}
