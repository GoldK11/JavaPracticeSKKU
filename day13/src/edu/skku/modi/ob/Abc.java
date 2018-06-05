package edu.skku.modi.ob;

public class Abc {
	int k = 5;
	static int n = 10; // 얘는 static이라 m을 new 안해도 쓸 수 있다. 
	//얘는 new 해서 부른는 애라서 new 하는 순간 메모리에 k까지 올라오기 때문에 k 쓸 수 있당
	public void m() {
		System.out.println("mm");
	}
	
	//독립적으로 사용할 메서드 (new를 안하고 쓰는거라 객체 생성 없이 씀 따라서 위에 적어놓은 k 못불러온다)
	public static void play() {
		System.out.println("pppppp");
		
	}
	
	//static은 객체지향의 예외사항(독립적)이므로 꼭 필요한 경우에만 쓰자 남용하지 말자!! 

}
