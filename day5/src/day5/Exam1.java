package day5;
// �Լ� ����� return�ؼ� �ֱ�
import java.util.Scanner;

public class Exam1 {
	static int[]ks = new int[10];
	static Scanner s = new Scanner(System.in);


	public static void main(String[] args) {
		for (int i=0;i<ks.length;++i) {
			ks[i]=s.nextInt();
		}//end for (�Է�)
		
		// 1. �հ� 
		int t = total();

		// 2. ���
		double avg = t/ks.length;
		System.out.println("���: "+avg);
		
		// 3. �ִ밪
		int mx = max();
		
		// 4. �ּҰ�
		int mn = min();
		
		// 5. �ִ밪-�ּҰ�
		System.out.println("�ִ밪-�ּҰ�: "+(mx-mn));
		
		// 6. �� ����� ����� ����
		System.out.println("�� ����� ����� ����:");
		for (int k:ks) System.out.print((int)(k-avg)+" "); //double Ÿ���� int�� �ٲٰ� ����
		//System.out.printf("%4.2f",(k-avg)+" ") ��ü ũ��� 4 �Ҵ�, �Ҽ� 2��° �ڸ����� ������ ���
	}//end main
	
	public static int total() {
		/*main �� ������ �������� �� 2����
		1. total()�� ��ȣ �ȿ� ������(parameter/�Ű�����)�� �ش� >> total(int[] ks)
		2. ���� ������ main���� ���� ���� class ������ �������ش�
		*/
		int sum = 0;
		for(int k:ks) sum=sum+k;
		System.out.println("�հ�: "+sum);
		return sum;
	}//end total
	
	public static int max() { 
		int max = ks[0];
		for (int k:ks) {
			if (k>max) max = k;  
		}
		System.out.println("�ִ밪: "+max);
		return max; // return �Ϸ��� void �� �ǵ����� ���� Ÿ������ ���ľ��Ѵ� 
					// (void�� �ǵ����ٰ� �����! ��� ��)
	}//end max
	
	public static int min() {
		int min = ks[0];
		for (int k:ks) {
			if (k<min) min = k;  
		}
		System.out.println("�ּҰ�: "+min);
		return min;
	}//end min

}//end class
