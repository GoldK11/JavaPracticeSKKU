package edu.skku.loop;

public class ForTest4 {
	// 1���� 100���� 7�� ����� �� ���ϱ�
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<=100; i=i+7) {
			//sum=sum+i;
			sum +=i;
			}
		System.out.println(sum);

	}

}
// if �� ���� ����
//for (int i; i<=100; i++) {
//	if(i%7==0) {
//		sum+=i
//	}
//}