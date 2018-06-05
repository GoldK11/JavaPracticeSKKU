package edu.skku.java2week;

public class Homework2 {

	public static void main(String[] args) {
		char[][] alpha = new char[5][5]; // 문자 배열이니까 int가 아니라 char로 쓰자
		char al ='A';
		for (int r=0;r<5;++r) {
			for (int c=0;c<5;++c) {
				if (r%2==0 ) alpha[r][c]=al++; // al 따로 쓰고 al = al+1 하면 al이 숫자가 된다 따라서 al++쓰는게 좋음
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
