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
			default : // else�� ���� ����
				System.out.println("F");

		// break �� ����ϴ� ����! case�� �� �� ���� �Ǵ� ���� �� �ڴ� ������ �ʰ� �� �����Ѵ� 	
		}

	}

}
