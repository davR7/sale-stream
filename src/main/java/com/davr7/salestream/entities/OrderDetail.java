package com.davr7.salestream.entities;

import java.io.Serializable;

import com.davr7.salestream.entities.pk.OrderDetailPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="order_detail")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="id")
public class OrderDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	@EmbeddedId
	private OrderDetailPK id = new OrderDetailPK();
	
	private Integer quantity;
	private Double price;
	
	public OrderDetail(Order order, Product product, Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
		id.setOrder(order);
		id.setProduct(product);
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	public Double getSubTotal() {
		return price * quantity;
	}
}
