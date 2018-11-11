package test;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		String key = getThirty_three();
		//UUID
		System.out.println(key);
		System.out.println(UUID.randomUUID()); 
	}
	
	
	public static String getThirty_three() {
		StringBuffer result=new StringBuffer();
		Random ra=new Random();
		result.append(convertIntToString(ra.nextInt(32)+1)+" ");
		int i=0;
		while(i<6) {
			String temp=convertIntToString(ra.nextInt(32)+1);
			if(!result.toString().contains(temp))	{
				i++;
				result.append(temp+" ");
			}
		}
		return result.toString();
	}
	
	private static String convertIntToString(int x)	{
		return x<10?"0"+String.valueOf(x):String.valueOf(x);
	}
	
}