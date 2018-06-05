package edu.ekku.loop2;

public class WhileTest {

	public static void main(String[] args) {
		int i =0;
		while(5>i) {
			System.out.println("while ==>i:"+i);
			i+=1;
		}
		System.out.println("i:"+i);
		
		int j = 0;
		do {
			System.out.println("do ==>j:"+j);
		}while(5>j++);
		System.out.println("j:"+j);
		
	}

}
