package com.davr7.salestream.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String fullname;
	protected String username;
	protected String email;
	protected String phone;
	@JsonIgnore
	protected String password;
	@CreatedDate
    @Column(nullable = false, updatable = false)
    protected LocalDateTime createdAt;
    @LastModifiedDate
    protected LocalDateTime updatedAt;
	
    public User(String fullname, String username, String email, String phone, String password) {
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
}
