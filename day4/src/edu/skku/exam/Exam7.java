package edu.skku.exam;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("�� ���� �Է��ϼ���");
			int n1 = s.nextInt();
			int n2 = s.nextInt();

			System.out.println("1. ���� \n2. ����\n3. ����\n4. ������\n0. ����");
			System.out.println("��ȣ�� ������");
			
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
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�");
			}
		}
		System.out.println("���α׷��� �����մϴ�");
		

		
		
			

	} // end main

}// end class
