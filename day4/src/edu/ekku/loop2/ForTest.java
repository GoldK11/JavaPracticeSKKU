package edu.ekku.loop2;

public class ForTest {

	public static void main(String[] args) {
		for (int i=1; i<10; ++i) {
			// if(i==7) break;
			if(i==7) continue; // continue�� ������ ���� �ؿ� �ִ� ����� �����ϰ� �ٽ� �ݺ������� �ö�
			System.out.println(i);
			System.out.println("fff");
		}

	}

}
