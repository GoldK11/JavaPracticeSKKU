package edu.skku.day9;

public class MethodTest2 {

	public static void main(String[] args) {
		int []su = {1,2,3,4,5,6,7,8,9,10}; 
		//�迭�� int���� �ֵ�� �ٸ��� �迭 ��ü�� main �ȿ� �ִ°� �ƴ϶� �迭�� �ּҰ��� �ִ� 
		int sum = sum(su);
		double avg = avg(sum,su.length);
		int max = max(su);
		System.out.println("sum: "+sum);
		System.out.println("average: "+avg);
		System.out.println("max: "+max);
	}// end main
	
	public static int sum(int[]su) {  //�迭�� �Ѱ��ִ°� �ƴ϶� �ּҸ� �Ѱ��ִ°�!
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
