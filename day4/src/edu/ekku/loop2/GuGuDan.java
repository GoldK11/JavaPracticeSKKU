package edu.ekku.loop2;

public class GuGuDan {

	public static void main(String[] args) {
		for (int j=2; j<=9;++j) {	
			for (int i=1;i<=9;++i) {
				if (j*i>=30) 
					break;    // 원래 {} 적어줘야 하는데 안에 문장이 하나밖에 없으면 생략 가능!
				System.out.println(j+"*"+i+"="+j*i);
			}
		System.out.println();
		}
	}

}
