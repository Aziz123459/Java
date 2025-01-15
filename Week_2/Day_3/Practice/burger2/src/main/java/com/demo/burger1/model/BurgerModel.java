package com.demo.burger1.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="burgers")
public class BurgerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2,message="must be at least 2")
	private String name;
	@Size(min=2,message="must be at least 2")
	private String resto;
	@NotNull
	@Min(value=0,message="too low")
	@Max(value=5,message="too high")
	private Integer rat;
	@Size(min=2,message="must be at least 2")
	private String note;
	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt=new Date();
		this.updatedAt=new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt=new Date();
	}
	public BurgerModel() {
		
	}

	public BurgerModel(Long id, @Size(min = 2) String name, @Size(min = 2) String resto, @Max(10) Integer rat,
			@Size(min = 2)String note, Date createdAt, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.resto = resto;
		this.rat = rat;
		this.note=note;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResto() {
		return resto;
	}

	public void setResto(String resto) {
		this.resto = resto;
	}

	public Integer getRat() {
		return rat;
	}

	public void setRat(Integer rat) {
		this.rat = rat;
	}
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
	
}
