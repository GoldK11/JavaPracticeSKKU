package edu.skku.java2week;

import java.util.Scanner;

public class Array2Exam1 {

	public static void main(String[] args) {
		int[][] sc = new int[5][4];
		Scanner s = new Scanner(System.in);
		
		// 데이터 입력
		for (int r=0;r<4;++r) {
			for (int c=0; c<5;++c) {
				sc[r][c]=s.nextInt();
			}
		}//end for
				
		//처리 각 행 별 평균을 구해 70 이상인 행의 번호 출력
		

	}

}
