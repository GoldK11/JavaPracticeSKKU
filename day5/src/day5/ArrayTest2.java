package day5;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] ks = new int[10]; 
		for (int i=0;i<ks.length;++i) {
			ks[i] = s.nextInt(); //키보드로부터 입력된 데이터를 ks배열의 0번지에 저장
		} // 데이터 입력
		
		//처리1. 입력된 숫자의 합계를 구해보기
		int sum = 0;
		for (int i=0;i<ks.length;++i) {
			sum = sum + ks[i];
		}
		System.out.println("배열의 합: "+sum);

		
		//처리2. d된 숫자 중 가장 큰 수 구하기
		int maximum = ks[0];
		for (int i=1;i<ks.length;++i) {
			if(maximum<ks[i]) {
				maximum = ks[i];
			}
			//end if
		}//end for
		System.out.println("최대값: "+maximum);
		
		for (int i=0;i<ks.length;++i) {
			System.out.print(ks[i]+" ");
		} // 데이터 출력
	}//end main

}//end class
