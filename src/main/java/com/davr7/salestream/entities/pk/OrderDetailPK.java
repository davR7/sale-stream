package com.davr7.salestream.entities.pk;

import java.io.Serializable;

import com.davr7.salestream.entities.Order;
import com.davr7.salestream.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class OrderDetailPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
}
