package operator;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		a = a + 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a ++;
		System.out.println(a);
		
		int b = 10;
		--b;
		System.out.println(b);
		b -= 1;
		System.out.println(b);
		
		// alt + ���Ʒ� ȭ��ǥ = �� �̵�
		// ctrl + alt + �������� ȭ��ǥ  = �� �� ����
		// ctrl + d = ����
		
		System.out.println(b);
		System.out.println(b--);	// �� ���� ���� ���ϰ� ����Ʈ ���� ���� �ϰ� ������
		System.out.println(--b);	// �׷��Ƿ� �̷��� ����
		
		int c = --b*3;
		System.out.println(c);	

		
		

		

	}

}
