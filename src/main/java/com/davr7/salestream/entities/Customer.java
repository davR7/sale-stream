package com.davr7.salestream.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id", callSuper = true)
@Builder
public class Customer extends User {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;

	public Customer(String id, String fullname, String username, String email, String phone, String password) {
		super(fullname, username, email, phone, password);
		this.id = id;
	}
}