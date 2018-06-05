package edu.skku.exam;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = s.nextInt();
		char p = 'A';
		for (int r=1;r<=n;++r) {
			for(int i=1;i<=n;++i) {
				System.out.printf("%2c",p);
				p+=1;
				if (p>'Z') p='A'; 
			}// end i
		System.out.println();	
		}//end r
		
	} // end main

}// end class
