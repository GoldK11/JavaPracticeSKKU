package day3;

import java.util.Random;	// Random class °¡Á®¿Ô¶¥¤¾¤¾

public class IfTest3 {

	public static void main(String[] args) {
		Random r = new Random();
		int score = r.nextInt(101);  
		System.out.println(score); 
		
		if (score>=90){
			System.out.println("A");
		}else if (score>=80) {
			System.out.println("B");
		}else if (score>=70) {
			System.out.println("C");
		}else if(score>=60) {                                         
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		System.out.println("End");
		
		
		

	}

}
