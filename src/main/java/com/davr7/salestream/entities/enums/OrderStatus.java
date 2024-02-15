package com.davr7.salestream.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int cod;
	
	private OrderStatus(Integer cod) {
		this.cod = cod;
	}
	
	public int getCod() {
		return cod;
	}
	
	public static OrderStatus valueOf(int cod) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCod() == cod) return value;
		}
		throw new IllegalArgumentException("Invalid orderstatus code");
	}
}
