package edu.skku.modi.ob;

public class TestAbc {

	public static void main(String[] args) {
		Abc a = new Abc();
		a.m();
		Abc.play();
		System.out.println(Abc.n);
		System.out.println(a.k); // 얘는 a를 new 해줬기 때문에 k를 불러올 수 있는데
		// System.out.println(Abc.k); 얘는 k가 static이 아니라 오류남
	}

}
