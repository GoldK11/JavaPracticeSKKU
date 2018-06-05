package day10;

public class Test2 {

	public static void main(String[] args) {
		MyData h1 = new MyData();
		h1.day =1;
		h1.month = 1;
		h1.year = 2017;
		
		// 한번에! 대신에 MyData에 생성자를 만들어줘야 한다
		MyData h2 = new MyData(2017,3,1);
		//동일한 정보는 생략!
		MyData h3 = new MyData(8,15);
		
		MyData h4 = new MyData(4);
		h4.day = 14;
		h4.year = 2000;
		
		h1.info();
		h2.info();
		h3.info();
		h4.info();
				
				

	}

}
