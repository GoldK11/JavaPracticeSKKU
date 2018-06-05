package edu.skku.day8;
// 2015311588 ��� �ǽ�����1 ������ǥ
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("data.txt"));
		int n = s.nextInt(); 
		int[][] map = new int[n][n];
		
		// �Է�
		for (int r=0;r<n;++r) {
			for(int c=0;c<n;++c) {
				map[r][c]=s.nextInt();
			}
		}
		//ó��
		
		int cod = 0;
		int cev = 0;
		
		for (int r=1;r<n-1;++r) {
			for(int c=1;c<n-1;++c) {
				int up = map[r-1][c];
				int down = map[r+1][c]; 
				int right = map[r][c+1];
				int left = map[r][c-1];
				
				if (up%2==0 && down%2==0 && right%2==0 && left%2==0) cev+=1;
				else if(up%2==1 && down%2==1 && right%2==1 && left%2==1) cod+=1;
			
			}
		}
				
		
		//���

		System.out.println("Ȧ�� ������ǥ�� ����:"+cod);
		System.out.println("¦�� ������ǥ�� ����:"+cev);

	}

}
