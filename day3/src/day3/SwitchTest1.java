package day3;

import java.util.Random;

public class SwitchTest1 {

	public static void main(String[] args) {
		Random r = new Random();
		int score = r.nextInt(101);
		System.out.println(score);
		switch(score/10){
			case 10:
				System.out.println("A");
			case 9:
				System.out.println("B");
			case 8:
				System.out.println("C");
				break;
			case 7:
				System.out.println("D");
				break;
			default : // else와 같은 개념
				System.out.println("F");

		// break 꼭 써야하는 이유! case가 한 번 참이 되는 순간 그 뒤는 묻지도 않고 다 실행한다 	
		}

	}

}
