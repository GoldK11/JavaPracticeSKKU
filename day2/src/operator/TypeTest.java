package operator;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 23;
		char grade = 'A';
		double score = 4.5;
		String name = "K kim";    // ����! char�� ���� ����ǥ'', String�� ū ����ǥ ""
		boolean result = score > 4.0;
		
		
		int k = 50;
		double d = 50.0;
		int ans = (int) (k + d);	// int ans = k + d �� ������			
		double ans2 = k + d;		// d�� double�� 64��Ʈ�ε� int�� 32 ��Ʈ�̹Ƿ� ������
		
				
		System.out.println(age);
		System.out.println(grade);
		System.out.println(score);
		System.out.println(name);
		System.out.println(result);

		System.out.println(ans);
		System.out.println(ans2);
		
		

	}

}
