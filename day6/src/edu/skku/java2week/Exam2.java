package edu.skku.java2week;
//selection sort algorithm
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int[] score = new int[10];
		Scanner s = new Scanner(System.in);
		
		System.out.println("10개의 성적을 입력하시오");
		for (int i =0; i<score.length; ++i) {
			score[i]=s.nextInt();
		}
		for (int j=0; j<score.length;++j) {
			int max = score[j];
			for (int i=j+1; i<score.length;++i) {
				if (score[i]>max) {
					max=score[i];
					score[i]=score[j];
					score[j]=max;
				}
					
				}
		}
		for (int i=0;i<score.length;++i) {
			System.out.print(score[i]+" ");
		}//end for
	}

}
