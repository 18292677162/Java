package Test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	    Scanner Score = new Scanner(System.in);
	    System.out.println("Input results:");
	    System.out.println(JudgeScore1(Score.nextInt()));
	    Test test=new Test();                //Non-static method instantiation
	    System.out.println(test.JudgeScore2(Score.nextInt()));                           
	    Score.close();              //Free memory 
	}
	
	                                           
	public static String JudgeScore1(int n) {   //A static method
		String Str = null;
		if(n >= 0 && n < 60) {
			Str = "E";
		}
		else if(n >= 60 && n < 70) {
			Str = "D";
		}
		else if(n >= 70 && n < 80) {
			Str = "C";
		}
		else if(n >= 80 && n < 90) {
			Str = "B";
		}
		else if(n >= 90 && n < 100) {
			Str = "A";
		}
		else {
			Str = "Input error";
		}	
		return Str;
	}
	
                                                
	public String JudgeScore2(int n) {        //Nonstatic method
		String Str = null;
		if (n > 100 || n < 0) {
			Str = "Input error";
			return Str;
        }
		switch(n / 10) {
		case 6:
			Str = "D";
			break;
		case 7:
			Str = "C";
			break;
		case 8:
			Str = "B";
			break;
		case 9:
			Str = "A";
			break;
		case 10:
		default:
			Str = "E";
		}
		return Str;
	}
}
