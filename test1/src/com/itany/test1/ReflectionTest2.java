package com.itany.test1;

import java.lang.reflect.Field;

public class ReflectionTest2 {

	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker","M",5600);
		Class cl = harry.getClass();
		try {
			Field f = cl.getDeclaredField("name");
			try {
				f.setAccessible(true);
				harry.setName("Harry Tom");
				f.set(harry,"Harry Naivee");
				Object v = f.get(harry);
			
				System.out.println(v);
			} catch (IllegalArgumentException e) {				
				e.printStackTrace();
			} catch (IllegalAccessException e) {				
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {			
			e.printStackTrace();
		} catch (SecurityException e) {		
			e.printStackTrace();
		}

	}

}
