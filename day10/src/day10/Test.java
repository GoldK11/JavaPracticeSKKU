package day10;

public class Test {

	public static void main(String[] args) {
		MyData today = new MyData();
		// �� �� today�� MyData�� �ּҸ� ����Ѵ�
		today.year = 2017;
		today.month = 11;
		today.day = 3;
		today.info();
		
		MyData birth = new MyData();
		birth.year = 1996;
		birth.month = 11;
		birth.day = 10;
		birth.info(); // �����
		
		// ���� ��Ī�ϴ� ȣĪ this
		// ��� ���� ��� �� ��� super
			
		

	}

}
