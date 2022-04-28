package com.example.demo.service;

import com.example.demo.entities.User;

public class UserService {

	public User getUser(String[] data) {
		String[] numbers = new String[data.length];
		String[] alphabets = new String[data.length];
		int n_idx = 0;
		int a_idx = 0;
		for(int i = 0; i < data.length; i++) {
			try { 
				Integer.parseInt(data[i]);
				numbers[n_idx] = data[i];
				n_idx++;
			}
			catch(Exception e) {
				alphabets[a_idx] = data[i];
				a_idx++;
			}
		}
		User u1 = new User(true, "nachiket_gawali_210943020054", "nachiketgawali.ng@gmail.com", "PD0612", numbers, alphabets);
		return u1;
	}
}
