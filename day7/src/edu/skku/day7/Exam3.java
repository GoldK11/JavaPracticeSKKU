package edu.skku.day7;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int [][] nums = new int[n][n];
		int i = 1;
		for (int c=0;c<n;c++) {
			for (int r=0;r<n;r++) {
				nums[r][c]=i++;
			}
		}
		for (int r=0;r<n;r++) {
			for (int c=0;c<n;c++) {
				System.out.printf("%-3d",nums[r][c]);
			}
			System.out.println();
		}
		
		

	}

}
