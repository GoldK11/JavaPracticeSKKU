package edu.skku.modi.ob;

public class TestAbc {

	public static void main(String[] args) {
		Abc a = new Abc();
		a.m();
		Abc.play();
		System.out.println(Abc.n);
		System.out.println(a.k); // ��� a�� new ����� ������ k�� �ҷ��� �� �ִµ�
		// System.out.println(Abc.k); ��� k�� static�� �ƴ϶� ������
	}

}
