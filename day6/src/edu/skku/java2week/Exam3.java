package edu.skku.java2week;
// ���� �ű� �� �˾Ƶ���!!!!!!
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String msg = s.next(); // nextInt�� ���� �Է�, next�� �����̳� ����Ű ������ ���ڿ� �Է�
		int []cnt = new int[10];

		for(int i=0;i<msg.length();++i) {
			char ch=msg.charAt(i); // ���ڿ��� i ��ġ�� ���� �ϳ��� ���� ch�� �����
			cnt[ch-'0']++;	// switch�� if �������� �ϳ��ϳ� �� ���ʿ� ���� �ٷ� �迭 �� ������Ŵ ��¼��������
		}
		for (int i=0;i<cnt.length;++i) {
			System.out.print(i+"��"+cnt[i]+"�� �Դϴ�.");
			System.out.println();
		}
	}
			
}
