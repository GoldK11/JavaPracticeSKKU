package edu.skku.loop;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int dan = s.nextInt();  // 0 ���� �� �ƴ϶� 1���� ���� �;
		
		for (int i = 1; i<=9; ++i) {  // ������ ������ �� �� ������� ++i �� i++�̵� �������
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
	}

}
