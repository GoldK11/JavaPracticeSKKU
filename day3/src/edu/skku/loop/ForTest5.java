package edu.skku.loop;

public class ForTest5 {

	public static void main(String[] args) {
		// 1~100 �� �� 3�� ����� 5�� ����� ������ ���� ���Ͻÿ�
		int count = 0;
		for (int i=0; i<=100; i++) {
			if(i%3==0 || i%5==0) { // ||�� or ǥ��, else if �� �ص� ��, &&�� and ǥ��(�����)
				count+=1;
			}
			
		}
		System.out.println(count);
		m();  // m method ȣ��!
		
	}//end main
	
	public static void m() { // ���ο� m method�� ���������� ���������
		System.out.println("this is m method!");
	}//end m method


}
