package edu.skku.exam;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1���� 9 ������ ���� �Է��ϼ���");
		int n = s.nextInt();
		char c = 'A';
		for (int r=1;r<=n;++r) {
			for (int sp=1;sp<=n-r;++sp) {      // �տ� ���� ����ϱ�
				System.out.print("  ");				
			}
			for(int i=1;i<=r;++i) {
				System.out.printf("%2c",c);
				c+=1;
				if (c>'Z') c='A'; 
			}// end i
		System.out.println();	
		}//end r
		
		
			

	} // end main

}// end class
