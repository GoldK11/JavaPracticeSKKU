package day1.Test;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);  // Ű���� ����

	int a = s.nextInt(); // Ű����κ��� �������� �Է¹޾ƶ�
	int b = s.nextInt();
	
	int result = 0;
	result = a + b;
	System.out.println(result);  //println : �ٹٲ�
	result = a - b;
	System.out.println(result);
	result = a * b;
	System.out.println(result);
	result = b / a;			// / �������� ��(������)
	System.out.println(result);
	result = b % a;			//% �������� ������ ��
	System.out.println(result);   // sysout ctrl + space > �ڵ��ϼ�

	
	
}
}
