package ��������;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        System.out.println("��������ֵ:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuffer lift = new StringBuffer();
        StringBuffer right = new StringBuffer();
        char t = ' ';//���������
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-'
                    || str.charAt(i) == '*' || str.charAt(i) == '/') {
                t = str.charAt(i);//ʶ����ʲô�����

                for (int j = i + 1; j < str.length(); j++) {
                	right.append(str.charAt(j));
                }
                break;
            } else {
            	lift.append(str.charAt(i));
            }
        }
        String c = lift.toString();
        String d = right.toString();
        double a = Double.parseDouble(c);
        double b = Double.parseDouble(d);
        double sum = 0;
        if (t == '+') {
            sum = a + b;
        }
        if (t == '-') {
            sum = a - b;
        }
        if (t == '*') {
            sum = a * b;
        }
        if (t == '/') {
            sum = a / b;
        }
        System.out.println(c+t+d+"="+sum);
	}

}
