package day5;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] ks = new int[10]; 
		for (int i=0;i<ks.length;++i) {
			ks[i] = s.nextInt(); //Ű����κ��� �Էµ� �����͸� ks�迭�� 0������ ����
		} // ������ �Է�
		
		//ó��1. �Էµ� ������ �հ踦 ���غ���
		int sum = 0;
		for (int i=0;i<ks.length;++i) {
			sum = sum + ks[i];
		}
		System.out.println("�迭�� ��: "+sum);

		
		//ó��2. d�� ���� �� ���� ū �� ���ϱ�
		int maximum = ks[0];
		for (int i=1;i<ks.length;++i) {
			if(maximum<ks[i]) {
				maximum = ks[i];
			}
			//end if
		}//end for
		System.out.println("�ִ밪: "+maximum);
		
		for (int i=0;i<ks.length;++i) {
			System.out.print(ks[i]+" ");
		} // ������ ���
	}//end main

}//end class
