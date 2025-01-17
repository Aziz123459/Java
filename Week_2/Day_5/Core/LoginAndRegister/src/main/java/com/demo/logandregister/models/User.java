package com.demo.logandregister.models;


import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull(message="the userName Should not be empty")
	@Size(min=3,message="userName should be at least 3 characters ")
	private String username;
	
	@Email
	@NotEmpty(message="the email should not be empty")
	private String email;
	
	@Size(min=8,message="the password must be at least 8 characters")
	private String password;
	@Transient
	@Size(min=8,message="the password must be at least 8 characters")
	private String confirm;
	
	@Column(updatable = false)
    private Date createdAt;

    private Date updatedAt;

   
	@PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
    public User() {
    	
    }

	public User(Long id,
			@NotNull(message = "the userName Should not be empty") @Size(min = 3, message = "userName should be at least 3 characters ") String username,
			@Email @NotNull(message = "the email should not be empty") String email,
			@Size(min = 8, message = "the password must be at least 8 characters") String password,
			@Size(min = 8, message = "the password must be at least 8 characters") String confirm, Date createdAt,
			Date updatedAt) {
		
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.confirm = confirm;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
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

