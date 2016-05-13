package com.java.entity;

import java.io.Serializable;

public class User implements Serializable{

	private static String username;
	private static int[] orderID = null;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public void User(String username, int[] orderID) {
		this.username = username;
		this.orderID = orderID;
	}

	public void User(String username) {
		this.username = username;
	}	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int[] getOrderID() {
		return orderID;
	}

	public void setOrderID(int[] orderID) {
		this.orderID = orderID;
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	
	System.out.print("Username : " + username + " - Order ID : ");
	if(orderID != null){
		for(int i = 0 ; i < orderID.length ; i++){
			System.out.print(orderID[i] + " , ");
		}
	}
	else{
		System.out.print("Empty Order");
	}
	System.out.println();
	return super.toString();
}

}
