package edu.skku.day9;

public class MethodTest {

	public static void main(String[] args) { // ��ȣ ���� �� parameters, arguments
		int a =5; // ��״� �������� 
		int b =9;
		int result = add(a,b)*sub(a,b);
		System.out.println(result);
				

	}// end main1
	// method �Լ�(function)
	public static int add(int x, int y) {
		// ���ϰ��� �ִٸ� ���� void �κп� ������ ���� �ڷ����� �����ش�
		System.out.println(x+y);
		return x+y;
	}//end main2
	
	public static int sub(int x, int y) {  //Ŭ���� �� �������� ���������� �ٸ� Ŭ������ ������� �ߺ��ŵ� �ȴ�
		System.out.println(x-y);
		return x-y;

	}// end main3

}


