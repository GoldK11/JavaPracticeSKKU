package edu.skku.loop;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan = s.nextInt();  // 0 부터 가 아니라 1부터 고르고 싶어서
		
		for (int i = 1; i<=9; ++i) {  // 독립적 문장이 세 개 들어있음 ++i 든 i++이든 상관없다
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
	}

}
