package edu.skku.loop;

public class ForTest3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		int a = 0;
		for(a=0;a<10;++a) System.out.println(a);
		System.out.println("a is "+a);
	}

}
