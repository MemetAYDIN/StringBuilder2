package com.godoro.string2;

import java.util.StringTokenizer;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.setName("String");
		sb.setId(450);
		sb.setLastName("String2");
		sb.setCount(45);
		
		String string=sb.getName()+", "
		+Integer.toString(sb.getId())+", "
				+Integer.toString(sb.getCount())+", "+sb.getLastName();
		
		StringTokenizer tokenizer=new StringTokenizer(string,",!?");
		
	
		while(tokenizer.hasMoreTokens())//iteratür patern"
		{
			String token=tokenizer.nextToken();
			System.out.println("# "+token);
		}
		
		
		
	}
	

}
