package edu.skku.java2week;

public class Homework2 {

	public static void main(String[] args) {
		char[][] alpha = new char[5][5]; // ���� �迭�̴ϱ� int�� �ƴ϶� char�� ����
		char al ='A';
		for (int r=0;r<5;++r) {
			for (int c=0;c<5;++c) {
				if (r%2==0 ) alpha[r][c]=al++; // al ���� ���� al = al+1 �ϸ� al�� ���ڰ� �ȴ� ���� al++���°� ����
				else alpha[r][4-c]=al++;;				
			}
		}
		for (int r=0;r<5;++r) {
			for (int c=0;c<5;++c) {
				System.out.printf("%2c",alpha[r][c]);
			}
			System.out.println();
		}
	
	}

}
