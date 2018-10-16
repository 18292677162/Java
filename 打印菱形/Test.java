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
		Scanner Input = new Scanner(System.in);     //Create an object of the keyboard entry class Scanner
		System.out.println("Input rows:");
	    Print(Input.nextInt());                     //function call
	    Input.close();                              //Free memory 
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
	