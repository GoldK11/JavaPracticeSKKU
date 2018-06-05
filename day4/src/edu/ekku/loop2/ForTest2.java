package edu.ekku.loop2;
//label test
public class ForTest2 {

	public static void main(String[] args) {
		int i = 0 , j = 0 ;
		while(3>j++) {
			System.out.println("outloop. j="+j);
			i = 0;
			test:while(3>i++) {
				System.out.println("Innerloop. i="+i);
				if(i==j) break test;
				System.out.println("InnerloopEnd");
			}System.out.println("outloopEnd");
		}
			

	}

}
