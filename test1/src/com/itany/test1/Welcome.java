package com.itany.test1;

import java.io.Console;

public class Welcome {

	public static void main(String[] args) {
		String[] greeting = new String[3];
		greeting[0] = "Welcome to Core Java";
		greeting[1] = "by Cay Horstmann";
		greeting[2] = "and Gary Corne";
		
		for(String g : greeting){
			System.out.println(g);
		}
		
//		Console console = System.console();	
//		String username = console.readLine("User Name:");
//		System.out.println(username);
//		char[] password = console.readPassword("Password:");
//		System.out.println(password.toString());
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		
				
				
				
				

	}

}
