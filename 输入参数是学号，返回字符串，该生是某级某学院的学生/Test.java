package Test;

import java.util.Scanner;
import java.util.regex.Pattern;;

public class Test {
	public static void main(String[] args) {
		System.out.println("Please enter 12 student numbers:");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		if(isNumeric(string) == false) {
			System.out.println("Input error");
		}
		else {
			judgeCollege(string);
		}
	}
	
	public static boolean isNumeric(String str){
//		if (str.length() != 12) {
//		return false;
//		}
		//The input number should be before 2018 (the program was written in 2018, I don't know when to start using it).
		String standard = "201900000000";
		int result = standard.compareTo(str);
		if (result > 0) {
			//Regular expressions determine whether strings conform to student number requirements.
			Pattern pattern = Pattern.compile("[0-2][0-9]{3}[0-1][0-9][0-9]{6}");
			return pattern.matcher(str).matches();
			}
		else 
			return false;
		}


	public static void judgeCollege(String str){
		//String str = "201606060618";
		String college = str.substring(4, 6);
		switch(college){
			case "01":
				college = "School of light industry science and Engineering";
				break;
			case "02":
				college = "School of materials science and Engineering";
				break;
			case "03":
				college = "School of environmental science and Engineering";
				break;
			case "04":
				college = "School of food and Bioengineering";
				break;
			case "05":
				college = "School of mechanical and electrical engineering";
				break;
			case "06":
				college = "School of electrical and Information Engineering";
				break;
			case "07":
				college = "School of economics and management";
				break;
			case "08":
				college = "School of chemistry and chemical engineering";
				break;
			case "09":
				college = "School of design and art";
				break;
			case "10":
				college = "College of Arts and Sciences";
				break;
			case "11":
				college = "Vocational Education Teachers College";
				break;
			default:
				college = "Unknowns";
				break;
		}
		
		System.out.println("This student is" + str.substring(0, 4) + "grade" + college + "¡®s student.");
	}
	
}

