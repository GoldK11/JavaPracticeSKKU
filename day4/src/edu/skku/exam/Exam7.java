package edu.skku.exam;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("두 수를 입력하세요");
			int n1 = s.nextInt();
			int n2 = s.nextInt();

			System.out.println("1. 덧셈 \n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n0. 종료");
			System.out.println("번호를 고르세요");
			
			int cho = s.nextInt();
			if(cho==0)break;
			else if(cho==1){
				System.out.println(n1+n2);
			}else if(cho==2) {
				System.out.println(n1-n2);
			}else if(cho==3) {
				System.out.println(n1*n2);
			}else if(cho==4) {
				System.out.println(n1/n2);
			}else {
				System.out.println("잘못된 숫자를 입력하셨습니다");
			}
		}
		System.out.println("프로그램을 종료합니다");
		

		
		
			

	} // end main

}// end class
