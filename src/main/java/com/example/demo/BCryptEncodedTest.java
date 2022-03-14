package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncodedTest {
	
	public static void main(String[] args) {
		
		BCryptPasswordEncoder b = new BCryptPasswordEncoder();
		
		String encode = b.encode("rajan");
		System.out.println(encode);
		
	}

}
