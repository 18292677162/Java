/*
         n  " "    *
   *     1   3     1
  ***    2   2     3
 *****   3   1     5
*******  4   0     7
 *****       1     5
  ***        2     3
   *         3     1
*/

package Test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);     //Creating objects for keyboard entry class Scanner
		System.out.println("Number of input lines:");
	    Print(Input.nextInt());                     //A function call
	    Scanner Score = new Scanner(System.in);
	    System.out.println("The input results:");
	    System.out.println(JudgeScore1(Score.nextInt()));
	    Test test=new Test();                //Non-static method instantiation
	    System.out.println(test.JudgeScore2(Score.nextInt()));
	    Input.close();                              //Free memory
	    Score.close();
	}

	
	public static void Print(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n - 1;j > i - 1;j--) {
				System.out.print(" ");
			}
			for(int j = 0;j < 2 * i - 1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n - 1;i > 0;i--) {
			for(int j = n - 1 ;j > i - 1;j--) {
				System.out.print(" ");
			}
			for(int j = 0;j < 2 * i - 1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
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
