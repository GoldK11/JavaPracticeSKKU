package edu.skku.loop;

import java.util.Random;

public class ForTest1 {

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 1; i<=6; ++i) {  // 독립적 문장이 세 개 들어있음 ++i 든 i++이든 상관없다
			int su = r.nextInt(45)+1;  // 0 부터 가 아니라 1부터 고르고 싶어서
			System.out.print(su+" ");
		}
		
	}

}
