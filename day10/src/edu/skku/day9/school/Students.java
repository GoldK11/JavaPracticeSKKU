package edu.skku.day9.school;
// Ŭ���� overloading �ǽ�
public class Students {
	int num;
	String name;
	double score;
	
	public Students() {	}
	public Students(int num, String name, int score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}
	public Students(int num, String name) {
		this.num = num;
		this.name = name;
		this.score = 0;
	}	
	
	public void study() {
		score++;
		System.out.println(name+" ������... ���� ����: "+score);
	}//end study
	public void study(int time) { //��ȣ ���� parameter�� �ٸ��� �̸� �Ȱ��� �ص� �ȴ�
		score=score*(0.5+time/10);
		System.out.println(name+" ����������... ��������: "+score);
	}
	public void paly(int time) {
		score-=time;
		System.out.println(name+" ����ߤ��� ���� ����: "+score);
	}

	

}
