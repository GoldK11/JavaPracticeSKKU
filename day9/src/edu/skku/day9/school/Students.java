package edu.skku.day9.school;
// main 없어서 이것만 돌리면 안돌아감!
public class Students {
	int num;
	String name;
	double score;

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
