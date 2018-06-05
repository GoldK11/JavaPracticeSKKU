package edu.skku.day7;
// open file, printf
// 정수 프린트 %2d (2칸 할당), 문자 프린트 %3c (3칸 할당) 
// 소수 프린트 %4.2f : 총 4칸 할당 중에 소수점 이하 2자리까지 표기(3번째 자리에서 반올림)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) throws FileNotFoundException {
		int[][] sc = new int[5][4];
		Scanner s = new Scanner(new File("data.txt"));
		
		// 데이터 입력
		for (int r=0;r<5;++r) {
			for (int c=0; c<4;++c) {
				sc[r][c]=s.nextInt();
			}
		}//end for
		
		int sum = 0;
		int max = 0;
		int pos = -1; // 초기값은 나올 수 없는 값으로 할당하는게 좋다 
		for (int r=0;r<5;++r) {
			sum = sc[r][1]+sc[r][2]+sc[r][3];
			if (max < sum) {
				max = sum;
				pos = sc[r][0];
			}
			
			System.out.printf("번호: %-2d국어: %-3d영어: %-3d수학: %-3d총점: %-4d평균: %-6.2f\n"
					,sc[r][0],sc[r][1],sc[r][2],sc[r][3],sum,sum/3.);
			}
		System.out.printf("1등은 %3d 번 입니다",pos);
		
	
	
	}
	

}
