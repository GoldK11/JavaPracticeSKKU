package edu.skku.exam;

import java.util.Random;

public class Exam2 {

	public static void main(String[] args) {
		Random r = new Random();
		for (int j=1; j<=5;++j) {
			System.out.println();
			for (int i=1;i<=6;++i) {
				int su=r.nextInt(45)+1;
				System.out.printf("%3d",su);  //printf 포맷 지정해주기
			}
		}

	}

}
