package day5;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] ks = new int[10];
		ks[0]=50;
		ks[1]=60;
		ks[2]=70;
		ks[3]=80;
		ks[4]=90;
		for (int i=0;i<ks.length;++i) {  // ks.length >> ks 배열의 길이
			System.out.println(ks[i]);
		}//값 할당 안하면 초기값으로 할당된 0이 뜬다
		String s = ""+40+20+10;
		System.out.println(s);

	}

}
