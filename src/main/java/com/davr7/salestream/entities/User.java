package com.davr7.salestream.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class User extends DateAudit {
	private static final long serialVersionUID = 1L;
	
	protected String fullname;
	protected String username;
	protected String email;
	protected String phone;
	@JsonIgnore
	protected String password;
}
