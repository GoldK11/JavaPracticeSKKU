package edu.skku.exam;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1���� 9 ������ ���� �Է��ϼ���");
		int n = s.nextInt();
		int p = 0;
		for (int r=1;r<=n;++r) {
			for(int i=1;i<=r;++i) {
				System.out.printf("%2d",p);
				p+=1;
				if (p>9) p=0; 
			}// end i
		System.out.println();	
		}//end r
		
		
			

	} // end main

}// end class
