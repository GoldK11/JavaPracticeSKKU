package edu.ekku.loop2;

public class GuGuDan {

	public static void main(String[] args) {
		for (int j=2; j<=9;++j) {	
			for (int i=1;i<=9;++i) {
				if (j*i>=30) 
					break;    // ���� {} ������� �ϴµ� �ȿ� ������ �ϳ��ۿ� ������ ���� ����!
				System.out.println(j+"*"+i+"="+j*i);
			}
		System.out.println();
		}
	}

}
