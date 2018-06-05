package edu.skku.util;

public class CarTest {

	public static void main(String[] args) {
		Book c = new Book("45더 5667","람보르기니",4700000);
		System.out.println(c);
		
		// 여러개 한번에 만들기
		
		Book [] cars = new Book[10];
		cars[0]=new Book("45더 5667","람보르기니",4700000);
		cars[1]=new Book("45더 5667","람보르기니",4700000);
		cars[2]=new Book("45더 5667","람보르기니",4700000);
		cars[3]=new Book("45더 5667","람보르기니",4700000);
		cars[4]=new Book("45더 5667","람보르기니",4700000);
		cars[5]=new Book("45더 5667","람보르기니",4700000);
		cars[6]=new Book("45더 5667","람보르기니",4700000);
		cars[7]=new Book("45더 5667","람보르기니",4700000);
		cars[7]=new Book("45더 5667","람보르기니",4700000);
		cars[8]=new Book("45더 5667","람보르기니",4700000);
		cars[9]=new Book("45더 5667","람보르기니",4700000);
		
		for (int i=0;i<cars.length;++i) System.out.println(cars[i]);
	}

}
