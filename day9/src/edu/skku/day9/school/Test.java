package edu.skku.day9.school;

public class Test {

	public static void main(String[] args) {
		Students s = new Students(); 
		Students k = new Students();
		// 1. Students Ŭ������ �޸𸮿� �ø���
		// 2. s �� Students�� �ּҸ� �����Ѵ�
		
		s.num = 851221;
		s.name = "Lenox";
		s.score = 78;

		k.num = 940120;
		k.name = "Anya";
		k.score = 80;		
		
		
		s.study();
		k.paly(55);
		s.paly(30);
		k.study();
		s.study(10);
		k.study(30);		
		s.paly(23);
		k.paly(44);
		s.study(15);
		k.study(13);

	}

}
