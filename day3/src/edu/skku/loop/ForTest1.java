package edu.skku.loop;

import java.util.Random;

public class ForTest1 {

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 1; i<=6; ++i) {  // ������ ������ �� �� ������� ++i �� i++�̵� �������
			int su = r.nextInt(45)+1;  // 0 ���� �� �ƴ϶� 1���� ���� �;
			System.out.print(su+" ");
		}
		
	}

}
