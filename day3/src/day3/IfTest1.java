package day3;

import java.util.Random;	// Random class �����Զ�����

public class IfTest1 {

	public static void main(String[] args) {
		// 0 ���� 100 ���̿� ���� ���� �������� Ŭ���� ��ȯ
		Random r = new Random();
		//new�� �޸𸮿��� �о�Ͷ�, �׸��� �� �ּҰ��� r�� �����ϴµ� �� r ���� Random �� �ڷ��� ��� (int ó��)
		int score = r.nextInt(101);   // r ���� ������ �������� ������ ()�ȿ� ���� ���
		System.out.println(score); 
		
		if (score>=70){
			System.out.println("Good job!");
		}
		
		
		

	}

}
