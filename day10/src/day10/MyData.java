package day10;

public class MyData {
	int year; // member ����
 	int month;
	int day;
	
	// ������ : constructor
	// Ŭ������ �̸��� ���� ����Ÿ���� ����� ��
	// ���� new �� �� ȣ���
	// �����ڸ� ������ ��� compiler�� �ƹ��͵� ���� �⺻ �����ڸ� �����
	//	public MyData() {} �䷸��!
	public MyData() {
		System.out.println("ccc");
	}
	// overloading : �̸��� ���� �ϰ� �Ű������� �ٸ��� �ؼ� �����ϴ� ���
	public MyData(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	public MyData(int month, int day) {
		year = 2017;
		this.month = month;
		this.day = day;
	} // �������� �����ϸ� ���ú��� ���� ��������� ������ ���� this. �ʿ�
	
	public MyData(int month) {
		this.month = month;
	}
	
	public void info() {
		System.out.println(year+"��"+month+"��"+day+"��");
	}
	

}
