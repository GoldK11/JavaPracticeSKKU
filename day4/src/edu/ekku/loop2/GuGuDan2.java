package edu.ekku.loop2;

public class GuGuDan2 {

	public static void main(String[] args) {
		ABC: 
		 // lable ... global ���� ����, ������� ���� 
		for (int j=2; j<=9;++j) {	
			for (int i=1;i<=9;++i) {
				if (j*i>=30) 
					break ABC;    // lable�� ���� ���� break �Ѵ�
				System.out.println(j+"*"+i+"="+j*i);
			}
		System.out.println();
		}
	}

}
