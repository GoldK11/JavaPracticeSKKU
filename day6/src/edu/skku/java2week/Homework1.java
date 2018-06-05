package edu.skku.java2week;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		int[][] sc = new int[5][4];
		Scanner s = new Scanner(System.in);
		
		// 데이터 입력
		for (int r=0;r<5;++r) {
			for (int c=0; c<4;++c) {
				sc[r][c]=s.nextInt();
			}
		}//end for
		
		int sum = 0;
		for (int r=0;r<5;++r) {
			sum = (sc[r][1]+sc[r][2]+sc[r][3]);
			if (sum/3>=70) {
				System.out.println(sc[r][0]);
			}//end if
		}//end for
		
	}
	
	
	

}
