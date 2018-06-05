package operator;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 23;
		char grade = 'A';
		double score = 4.5;
		String name = "K kim";    // 주의! char는 작은 따옴표'', String은 큰 따옴표 ""
		boolean result = score > 4.0;
		
		
		int k = 50;
		double d = 50.0;
		int ans = (int) (k + d);	// int ans = k + d 는 오류남			
		double ans2 = k + d;		// d는 double형 64비트인데 int는 32 비트이므로 못담음
		
				
		System.out.println(age);
		System.out.println(grade);
		System.out.println(score);
		System.out.println(name);
		System.out.println(result);

		System.out.println(ans);
		System.out.println(ans2);
		
		

	}

}
