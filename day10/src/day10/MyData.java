package day10;

public class MyData {
	int year; // member 변수
 	int month;
	int day;
	
	// 생성자 : constructor
	// 클래스와 이름이 같고 리턴타입이 없어야 됨
	// 오직 new 할 때 호출됨
	// 생성자를 생략할 경우 compiler가 아무것도 없는 기본 생성자를 만든다
	//	public MyData() {} 요렇게!
	public MyData() {
		System.out.println("ccc");
	}
	// overloading : 이름을 같게 하고 매개변수를 다르게 해서 정의하는 기법
	public MyData(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	public MyData(int month, int day) {
		year = 2017;
		this.month = month;
		this.day = day;
	} // 변수명을 같게하면 로컬변수 말고 멤버변수로 보내기 위해 this. 필요
	
	public MyData(int month) {
		this.month = month;
	}
	
	public void info() {
		System.out.println(year+"년"+month+"월"+day+"일");
	}
	

}
