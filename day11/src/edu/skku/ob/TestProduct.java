package edu.skku.ob;

public class TestProduct {

	public static void main(String[] args) {
		// �� �ϳ��ϳ� �־��ֱ�
		Product p = new Product();
		p.pcode = 1000;
		p.pname = "Smart TV";
		p.price= 150;
		p.quant = 15;
		p.pdesc="LED TV";
		p.info();
		System.out.println(p.toString());  // toString �� ������
		System.out.println(p); //�ּҰ� ����´� toString�� �Ȱ��� ��´�
		
		// �����ڷ� �� �ѹ��� �־��ֱ�
		Product p2 = new Product(1002,"OLED TV",140,10);
		System.out.println(p2); //p2�� �ּҰ��� ��°� �ƴ϶� toString�� ��´�
	}

}
