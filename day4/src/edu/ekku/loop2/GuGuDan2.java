package edu.ekku.loop2;

public class GuGuDan2 {

	public static void main(String[] args) {
		ABC: 
		 // lable ... global 같은 역할, 권장되지 않음 
		for (int j=2; j<=9;++j) {	
			for (int i=1;i<=9;++i) {
				if (j*i>=30) 
					break ABC;    // lable이 붙은 곳을 break 한다
				System.out.println(j+"*"+i+"="+j*i);
			}
		System.out.println();
		}
	}

}
