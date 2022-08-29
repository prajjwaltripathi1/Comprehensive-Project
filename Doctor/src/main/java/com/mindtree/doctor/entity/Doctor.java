package com.mindtree.doctor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    
	private long id;
	private String name;
	private int age;
	private String gender;
	private String specialistField;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialistField() {
		return specialistField;
	}
	public void setSpecialistField(String specialistField) {
		this.specialistField = specialistField;
	}
	public Doctor(long id, String name, int age, String gender, String specialistField) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialistField = specialistField;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
