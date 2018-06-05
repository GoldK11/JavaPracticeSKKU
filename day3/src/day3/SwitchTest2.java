package day3;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = s.nextInt();
		System.out.println(month);
		int endDay=0;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				endDay=31;
				break;
			case 2:
				endDay=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				endDay=30;
			default:
				System.out.println("Uncorrect input");		
				
		}
		System.out.println("마지막 날:"+endDay);

		
	}

}
