package day10;

public class Test {

	public static void main(String[] args) {
		MyData today = new MyData();
		// 이 때 today는 MyData의 주소를 기억한다
		today.year = 2017;
		today.month = 11;
		today.day = 3;
		today.info();
		
		MyData birth = new MyData();
		birth.year = 1996;
		birth.month = 11;
		birth.day = 10;
		birth.info(); // 출력함
		
		// 나를 지칭하는 호칭 this
		// 상속 받을 경우 그 대상 super
			
		

	}

}
