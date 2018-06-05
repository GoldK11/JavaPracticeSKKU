package day3;

import java.util.Random;	// Random class °¡Á®¿Ô¶¥¤¾¤¾

public class IfTest2 {

	public static void main(String[] args) {
		Random r = new Random();
		int score = r.nextInt(101);   
		System.out.println(score); 
		
		if (score>=70){
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		

	}

}
