package edu.skku.ob;

public class TestProduct {

	public static void main(String[] args) {
		// 값 하나하나 넣어주기
		Product p = new Product();
		p.pcode = 1000;
		p.pname = "Smart TV";
		p.price= 150;
		p.quant = 15;
		p.pdesc="LED TV";
		p.info();
		System.out.println(p.toString());  // toString 꼭 만들자
		System.out.println(p); //주소값 안찍는다 toString과 똑같이 찍는다
		
		// 생성자로 값 한번에 넣어주기
		Product p2 = new Product(1002,"OLED TV",140,10);
		System.out.println(p2); //p2의 주소값을 찍는게 아니라 toString을 찍는다
	}

}
