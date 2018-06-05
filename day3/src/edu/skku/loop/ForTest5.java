package edu.skku.loop;

public class ForTest5 {

	public static void main(String[] args) {
		// 1~100 값 중 3의 배수와 5의 배수의 갯수의 합을 구하시오
		int count = 0;
		for (int i=0; i<=100; i++) {
			if(i%3==0 || i%5==0) { // ||는 or 표시, else if 로 해도 됨, &&는 and 표시(공배수)
				count+=1;
			}
			
		}
		System.out.println(count);
		m();  // m method 호출!
		
	}//end main
	
	public static void m() { // 새로운 m method를 독립적으로 만들엇숴요
		System.out.println("this is m method!");
	}//end m method


}
