package edu.skku.day9.school;
// 클래스 overloading 실습
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
		System.out.println(name+" 공부중... 현재 점수: "+score);
	}//end study
	public void study(int time) { //괄호 안의 parameter가 다르면 이름 똑같이 해도 된다
		score=score*(0.5+time/10);
		System.out.println(name+" 열공빡공중... 현재점수: "+score);
	}
	public void paly(int time) {
		score-=time;
		System.out.println(name+" 노는중ㅎㅎ 현재 점수: "+score);
	}

	

}
