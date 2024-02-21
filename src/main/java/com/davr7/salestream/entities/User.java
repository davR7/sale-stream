package com.davr7.salestream.entities;

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
public abstract class User extends DateAudit {
	private static final long serialVersionUID = 1L;
	
	protected String fullname;
	protected String username;
	protected String email;
	protected String phone;
	protected String password;
}
