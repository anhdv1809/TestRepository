package com.java.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.java.entity.User;
import com.java.utility.SerializableUtil;

public class UserFunction {

	// private String fileName = "C:\\Users\\training\\workspace\\File\\" +
	// username + ".txt";
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String username) {
		this.fileName = "C:\\Users\\training\\workspace\\File\\" + username + ".txt";
	}

	public UserFunction() {
		// TODO Auto-generated constructor stub
	}

	public void AddFunction(String username, int[] orderID) {

		setFileName(username);
		File f = new File(fileName);
		
		
		if (f.exists() && !f.isDirectory()) {
			// do something
			System.out.println("Added");
		} else {
			User user = new User();
			user.User(username, orderID);

			// serialize to file
			try {
				SerializableUtil.serialize(user, fileName);

			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	}
	
	public void AddFunction(String username){
		setFileName(username);
		File f = new File(fileName);
		
		
		if (f.exists() && !f.isDirectory()) {
			// do something
			System.out.println("Added");
		} else {
			User user = new User();
			user.User(username);

			// serialize to file
			try {
				SerializableUtil.serialize(user, fileName);

			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
	}

	public void ReadFunction(String username) {
		User user = new User();
		setFileName(username);
		try {
			user = (User) SerializableUtil.deserialize(fileName);
		}
		catch (FileNotFoundException e) {
			System.out.println("There's no customer with the name : " + username);
			AddFunction(username);
			System.out.println("Added customer");
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.toString();
	}

	public List<String> getListAll() {

		ArrayList<String> result = new ArrayList<>();
		File folder = new File("C:\\Users\\training\\workspace\\File\\");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].getName().toLowerCase().endsWith(".txt")) {
				
				result.add(listOfFiles[i].getName().split(".txt")[0]);
				System.out.println("File " + result.get(i));
				
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
		return result;
	}
}
