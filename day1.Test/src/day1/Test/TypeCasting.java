package day1.Test;

public class TypeCasting {

	public static void main(String[] args) {
		byte b1 =10;
		byte b2 =20;
		byte b3 = (byte)(b1+b2);
		
		long i = 100L;
		int j = (int) i;
		float f =3.2f;
		double d =3.1;
		char c = 'A';
		String s= "AB";
		
		int k = 33;
		char cc = (char)k;
		
		boolean boo = true;
		boolean bool = false;
		
		long var = 100;
		float fvar = var;
		
		int a = 10;
		int b = 3;
		float dd = a/b;
		float ff = 3.1f;
		
		int res = a/b;
		double fres = a/b;
		float ffres = (int)(a/ff);
		int la = (int)3.2;
		
		int how = 10/3;
		double fhow = 10./3;
		
		
		System.out.println(how);
		System.out.println(fhow);
				
		System.out.println(ffres);
		System.out.println(la);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(i);
		System.out.println(j);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println(k);
		System.out.println(cc);
		System.out.println(bool);
		System.out.println(boo);
		System.out.println(fvar);
		System.out.println(res);
		System.out.println((double)res);
		System.out.println(dd);

		System.out.println(fres);

				
		

	}

}
