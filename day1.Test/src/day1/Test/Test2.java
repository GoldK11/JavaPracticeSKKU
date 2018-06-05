package day1.Test;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);  // 키보드 연결

	int a = s.nextInt(); // 키보드로부터 정수값을 입력받아라
	int b = s.nextInt();
	
	int result = 0;
	result = a + b;
	System.out.println(result);  //println : 줄바꿈
	result = a - b;
	System.out.println(result);
	result = a * b;
	System.out.println(result);
	result = b / a;			// / 나누기의 몫(정수값)
	System.out.println(result);
	result = b % a;			//% 나누기의 나머지 값
	System.out.println(result);   // sysout ctrl + space > 자동완성

	
	
}
}
