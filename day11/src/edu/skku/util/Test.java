package edu.skku.util;

public class Test {

	public static void main(String[] args) {
		Mydate m =new Mydate();
		m.setYear(2015);
		m.setMonth(4);
		m.setDay(3);
		System.out.println(m); //toSting Âï´Â´Ù
		System.out.println(m.getDay());
		
		Mydate m2 = new Mydate(2013,4,55);
		
		
		

	}
}
