package com.mindtree.patient.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	private String name ;
	private String visitedDoctor;
	private Date dateOfVisit;
	private String prescription;
	
	
	public Patient(String prescription) {
		super();
		this.prescription = prescription;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
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
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public Date getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public Patient(long id, String name, String visitedDoctor, Date dateOfVisit) {
		super();
		this.id = id;
		this.name = name;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
