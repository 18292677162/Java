package ��̬_�������_������Ф;

import java.util.*;
public class Test{
   public static void main(String []args){  
	   //����������һ����ݣ��س�����������������Ф
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please input a int year:");
       int year=sc.nextInt();
       String animal=calZodiac(year);
       System.out.println(year+" year is "+animal+" year.");
       }
/**
*����һ���ڲ��������÷������ݴ�������ݲ�������������������Ф
**/
public static String calZodiac(int year)
{
	String zodiac="";
	int n=year%12;
	switch(n){
	case 0:
		zodiac="monkey";
		break;
	case 1:
		zodiac="chicken";
		break;
	case 2:
		zodiac="dog";
		break;
	case 3:
		zodiac="pig";
		break;
	case 4:
		zodiac="mouse";
		break;
	case 5:
		zodiac="cow";
		break;
	case 6:
		zodiac="tiger";
    	break;
	case 7:
		zodiac="rabbit";
		break;
	case 8:
		zodiac="dragon";
		break;
	case 9:
		zodiac="snake";
		break;
	case 10:
		zodiac="horse";
		break;
	case 11:
		zodiac="sheep";
		break;
	}
	return zodiac;
	}
}
