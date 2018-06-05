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
		
		// alt + 위아래 화살표 = 줄 이동
		// ctrl + alt + 내려가는 화살표  = 한 줄 복사
		// ctrl + d = 삭제
		
		System.out.println(b);
		System.out.println(b--);	// 이 경우는 빼기 안하고 프린트 부터 수행 하고 뺴기함
		System.out.println(--b);	// 그러므로 이렇게 쓰자
		
		int c = --b*3;
		System.out.println(c);	

		
		

		

	}

}
