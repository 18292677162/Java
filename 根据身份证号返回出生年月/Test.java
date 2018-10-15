package Test;

import java.util.Scanner;
import java.util.regex.Pattern;;

public class Test {
	public static void main(String[] args) {
		System.out.println("Please enter 18 digit id number:");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
//		String str = "610702199901245973";
		if(isNumeric(string) == false) {
			System.out.println("Input error");
		}
		else {
			System.out.println("The man was born in" + string.substring(6, 10) + "." + string.substring(10, 12) + "." + string.substring(12, 14) + ".");
		}
	}
	
	public static boolean isNumeric(String str){
			//A regular expression determines whether a string meets the id number requirement
			Pattern pattern = Pattern.compile("[0-9]{18}");
			return pattern.matcher(str).matches();
			}
	
}

