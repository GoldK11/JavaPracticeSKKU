package edu.ekku.loop2;

public class ForTest {

	public static void main(String[] args) {
		for (int i=1; i<10; ++i) {
			// if(i==7) break;
			if(i==7) continue; // continue를 만나는 순간 밑에 있는 문장들 무시하고 다시 반복문으로 올라감
			System.out.println(i);
			System.out.println("fff");
		}

	}

}
