package edu.skku.day9;

public class MethodTest {

	public static void main(String[] args) { // 괄호 안의 값 parameters, arguments
		int a =5; // 얘네는 지역변수 
		int b =9;
		int result = add(a,b)*sub(a,b);
		System.out.println(result);
				

	}// end main1
	// method 함수(function)
	public static int add(int x, int y) {
		// 리턴값이 있다면 원래 void 부분에 리턴할 값의 자료형을 적어준다
		System.out.println(x+y);
		return x+y;
	}//end main2
	
	public static int sub(int x, int y) {  //클래스 내 변수명은 지역변수라 다른 클래스의 변수명과 중복돼도 된다
		System.out.println(x-y);
		return x-y;

	}// end main3

}


