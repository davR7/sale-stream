package com.davr7.salestream.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id", callSuper = true)
public class Customer extends User {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Order> orders = new HashSet<>(); 

	public Customer(String id, String fullname, String username, String email, String phone, String password) {
		super(fullname, username, email, phone, password);
		this.id = id;
	}
	
	public Set<Order> getOrders() {
		return orders;
	}
}
