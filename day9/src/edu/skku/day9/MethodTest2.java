package edu.skku.day9;

public class MethodTest2 {

	public static void main(String[] args) {
		int []su = {1,2,3,4,5,6,7,8,9,10}; 
		//배열은 int같은 애들과 다르게 배열 자체가 main 안에 있는게 아니라 배열의 주소값만 있다 
		int sum = sum(su);
		double avg = avg(sum,su.length);
		int max = max(su);
		System.out.println("sum: "+sum);
		System.out.println("average: "+avg);
		System.out.println("max: "+max);
	}// end main
	
	public static int sum(int[]su) {  //배열을 넘겨주는게 아니라 주소를 넘겨주는것!
		int sum = 0; 
		for(int i=0;i<su.length;i++) sum+=su[i];
		return sum;
				
	}//end sum
	
	public static double avg(int sum, int len) {
		double avg = (double)sum/len;
		return avg;
				
	}//end avg
	
	public static int max(int[]su) {
		int max = su[0];
		for (int i=1;i<su.length;i++) {
			if (su[i]>max) max = su[i];					
		}
		return max;
				
	}//end max

}
