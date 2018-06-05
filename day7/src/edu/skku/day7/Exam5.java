package edu.skku.day7;
// �κ� �̵�
// next().charAt()
//switch

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) throws FileNotFoundException {
		// �Է�
		Scanner s = new Scanner(new File("data2.txt"));
		int n = s.nextInt(); // ó�� �����ʹ� ���� �����ϱ� nextInt�� �о���°� �´�
		
		char[][] map = new char[n][n];
		
		for (int r=0;r<n;++r) {
			for(int c=0;c<n;++c) {
				map[r][c] = s.next().charAt(0); // next�� ������ �������� ���ڿ��� �о���Ƿ�
				//charó�� index��° ��ġ�� �� ���ڸ� �о���� �Ϸ��� �ڿ� charAt(index)�� �߰����ش�		
			}
		}
		//ó��
		int count =0;
		for (int r=0;r<n;++r) {
			for(int c=0;c<n;++c) {
				switch (map[r][c]){
				
				case 'A':
					for(int a=c+1;a<n;++a) {
						if(map[r][a]=='S') count++;
						else break;
					}
					break;

				case 'B':
					for(int a=c+1;a<n;++a) {
						if(map[r][a]=='S') count++;
						else break;
					}
					for(int a=c-1;a>=0;--a) {
						if(map[r][a]=='S') count++;
						else break;
					}
					break;
				
				case 'C':
					for(int a=c+1;a<n;++a) {
						if(map[r][a]=='S') count++;
						else break;
					}
					for(int a=c-1;a>=0;--a) {
						if(map[r][a]=='S') count++;
						else break;
					}
					for(int a=r+1;a<n;++a) {
						if(map[a][c]=='S') count++;
						else break;
					}
					for(int a=r-1;a>=0;--a) {
						if(map[a][c]=='S') count++;
						else break;
					}
				}//end switch
			}
		}
	
		//���
		System.out.println(count);

	}//end main

}// end class
