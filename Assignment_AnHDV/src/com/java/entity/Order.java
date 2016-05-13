package com.java.entity;

import java.util.Timer;

public class Order {

	int orderID;
	float total;
	// Timer time;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public void Order(int orderID, float total) {
		this.orderID = orderID;
		this.total = total;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

}
