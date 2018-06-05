package edu.skku.loop;

public class ForTest4 {
	// 1부터 100까지 7의 배수의 합 구하기
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<=100; i=i+7) {
			//sum=sum+i;
			sum +=i;
			}
		System.out.println(sum);

	}

}
// if 문 쓰는 버전
//for (int i; i<=100; i++) {
//	if(i%7==0) {
//		sum+=i
//	}
//}