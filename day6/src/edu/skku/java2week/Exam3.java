package edu.skku.java2week;
// 조따 신기 꼭 알아두자!!!!!!
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String msg = s.next(); // nextInt는 숫자 입력, next는 공백이나 엔터키 전까지 문자열 입력
		int []cnt = new int[10];

		for(int i=0;i<msg.length();++i) {
			char ch=msg.charAt(i); // 문자열의 i 위치의 문자 하나를 꺼내 ch에 담아줌
			cnt[ch-'0']++;	// switch나 if 구문으로 하나하나 다 할필요 없이 바로 배열 방 증가시킴 개쩌러ㅋㅋㅋ
		}
		for (int i=0;i<cnt.length;++i) {
			System.out.print(i+"은"+cnt[i]+"개 입니다.");
			System.out.println();
		}
	}
			
}
