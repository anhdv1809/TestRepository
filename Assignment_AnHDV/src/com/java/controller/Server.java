package com.java.controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.java.entity.User;
import com.java.function.UserFunction;
import com.java.utility.SerializableUtil;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String username = "C";
//		int[] orderID = {1,2,3,4,5,6,7,8,9,10};
//		UserFunction uf = new UserFunction();
//		uf.AddFunction(username, orderID);
//		uf.ReadFunction(username);
//		uf.getListAll();
		
		Scanner sc = new Scanner(System.in);
		String customer;
		System.out.println("Find the customer with name : ");
		customer = sc.nextLine();
		
		//Run user function - Add / Read / Get List
		UserFunction test = new UserFunction();
		test.ReadFunction(customer);
		
	}		
}


