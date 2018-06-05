package day5;
// 함수 만들고 return해서 주기
import java.util.Scanner;

public class Exam1 {
	static int[]ks = new int[10];
	static Scanner s = new Scanner(System.in);


	public static void main(String[] args) {
		for (int i=0;i<ks.length;++i) {
			ks[i]=s.nextInt();
		}//end for (입력)
		
		// 1. 합계 
		int t = total();

		// 2. 평균
		double avg = t/ks.length;
		System.out.println("평균: "+avg);
		
		// 3. 최대값
		int mx = max();
		
		// 4. 최소값
		int mn = min();
		
		// 5. 최대값-최소값
		System.out.println("최대값-최소값: "+(mx-mn));
		
		// 6. 각 값들과 평균의 차이
		System.out.println("각 값들과 평균의 차이:");
		for (int k:ks) System.out.print((int)(k-avg)+" "); //double 타입을 int로 바꾸고 싶음
		//System.out.printf("%4.2f",(k-avg)+" ") 전체 크기는 4 할당, 소수 2번째 자리까지 나오게 출력
	}//end main
	
	public static int total() {
		/*main 블럭 데이터 가져오는 법 2가지
		1. total()의 괄호 안에 데이터(parameter/매개변수)를 준다 >> total(int[] ks)
		2. 변수 선언을 main보다 상위 블럭인 class 블럭에서 선언해준다
		*/
		int sum = 0;
		for(int k:ks) sum=sum+k;
		System.out.println("합계: "+sum);
		return sum;
	}//end total
	
	public static int max() { 
		int max = ks[0];
		for (int k:ks) {
			if (k>max) max = k;  
		}
		System.out.println("최대값: "+max);
		return max; // return 하려면 void 를 되돌려줄 값의 타입으로 고쳐야한다 
					// (void는 되돌려줄게 없어요! 라는 뜻)
	}//end max
	
	public static int min() {
		int min = ks[0];
		for (int k:ks) {
			if (k<min) min = k;  
		}
		System.out.println("최소값: "+min);
		return min;
	}//end min

}//end class
