package edu.skku.day7;
// open file, printf
// ���� ����Ʈ %2d (2ĭ �Ҵ�), ���� ����Ʈ %3c (3ĭ �Ҵ�) 
// �Ҽ� ����Ʈ %4.2f : �� 4ĭ �Ҵ� �߿� �Ҽ��� ���� 2�ڸ����� ǥ��(3��° �ڸ����� �ݿø�)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) throws FileNotFoundException {
		int[][] sc = new int[5][4];
		Scanner s = new Scanner(new File("data.txt"));
		
		// ������ �Է�
		for (int r=0;r<5;++r) {
			for (int c=0; c<4;++c) {
				sc[r][c]=s.nextInt();
			}
		}//end for
		
		int sum = 0;
		int max = 0;
		int pos = -1; // �ʱⰪ�� ���� �� ���� ������ �Ҵ��ϴ°� ���� 
		for (int r=0;r<5;++r) {
			sum = sc[r][1]+sc[r][2]+sc[r][3];
			if (max < sum) {
				max = sum;
				pos = sc[r][0];
			}
			
			System.out.printf("��ȣ: %-2d����: %-3d����: %-3d����: %-3d����: %-4d���: %-6.2f\n"
					,sc[r][0],sc[r][1],sc[r][2],sc[r][3],sum,sum/3.);
			}
		System.out.printf("1���� %3d �� �Դϴ�",pos);
		
	
	
	}
	

}
