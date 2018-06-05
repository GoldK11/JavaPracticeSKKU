package operator;

public class OpTest3 {

	public static void main(String[] args) {
		int a = 6;
		int b = --a*3;
		
		int x = 2;
		int i = 2;
		int y = ++x;
		int z = i++;
				
		String s1 = "Korea";
		
		String s2 = s1+a;
		String s3 = a+s1;
		String s4 = "Korea"+10+'A';
		String s5 = "K"+10;
		double s6 = 'A'+1.2;
		String s7 = 30+40+""+20;
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);

		System.out.println(a);
		System.out.println(b);

		System.out.println(y);
		System.out.println(z);
		System.out.println(x);
		System.out.println(i);


				

	}

}
