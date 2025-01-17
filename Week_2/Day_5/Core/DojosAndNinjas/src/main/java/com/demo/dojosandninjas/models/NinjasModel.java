package com.demo.dojosandninjas.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
@Entity
@Table(name="Ninjas")
public class NinjasModel {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	@Size(min=2,message="first name must be at least 2 characters")
	private String firstname;
	
	@Size(min=5,message="last name must be at least 5 characters")
	private String lastname;
	
	
	private int age;
	
	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="dojo_id")
	private  DojosModel dojo;
	
	
	@PrePersist
	protected void onCreate() {
		this.createdAt=new Date();
		this.updatedAt=new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt=new Date();
	}
	public NinjasModel() {
		
	}

	public NinjasModel(Long id, @Size(min = 2, message = "first name must be at least 2 characters") String firstname,
			@Size(min = 5, message = "last name must be at least 5 characters") String lastname,
			@Size(min = 5, message = "Description must be at least 5 characters") int age, Date createdAt,
			Date updatedAt, DojosModel dojo) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.dojo = dojo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public DojosModel getDojo() {
		return dojo;
	}

	public void setDojo(DojosModel dojo) {
		this.dojo = dojo;
	}
	
}
