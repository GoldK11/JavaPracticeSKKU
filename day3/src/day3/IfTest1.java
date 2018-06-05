package day3;

import java.util.Random;	// Random class 가져왔땅ㅎㅎ

public class IfTest1 {

	public static void main(String[] args) {
		// 0 부터 100 사이에 랜던 값을 가져오는 클래스 소환
		Random r = new Random();
		//new는 메모리에서 읽어와라, 그리고 그 주소값을 r에 저장하는데 그 r 앞의 Random 은 자료형 명시 (int 처럼)
		int score = r.nextInt(101);   // r 에서 임의의 정수값을 가져와 ()안에 범위 명시
		System.out.println(score); 
		
		if (score>=70){
			System.out.println("Good job!");
		}
		
		
		

	}

}
