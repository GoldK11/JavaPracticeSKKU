package edu.skku.day7;
// 로봇 이동
// next().charAt()
//switch

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) throws FileNotFoundException {
		// 입력
		Scanner s = new Scanner(new File("data2.txt"));
		int n = s.nextInt(); // 처음 데이터는 숫자 맞으니까 nextInt로 읽어오는거 맞다
		
		char[][] map = new char[n][n];
		
		for (int r=0;r<n;++r) {
			for(int c=0;c<n;++c) {
				map[r][c] = s.next().charAt(0); // next는 공백을 기준으로 문자열을 읽어오므로
				//char처럼 index번째 위치의 한 글자만 읽어오게 하려면 뒤에 charAt(index)를 추가해준다		
			}
		}
		//처리
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
	
		//출력
		System.out.println(count);

	}//end main

}// end class
