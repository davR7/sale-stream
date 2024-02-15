package com.davr7.salestream.entities;

import java.io.Serializable;
import java.time.Instant;

import com.davr7.salestream.entities.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="id")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private Instant orderDate;
	private Integer orderStatus;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	public Order(String id, Instant orderDate, OrderStatus orderStatus, Customer customer) {
		this.id = id;
		this.orderDate = orderDate;
		this.customer = customer;
		setStatus(orderStatus);
	}
	
	public OrderStatus getStatus() {
		return OrderStatus.valueOf(orderStatus);
	}
	
	public void setStatus(OrderStatus orderStatus) {
		if (orderStatus != null) {
			this.orderStatus = orderStatus.getCod();
		}
	}
}