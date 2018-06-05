package edu.skku.day8;
// 2015311588 ±è°á ½Ç½À°úÁ¦2 ºôµù
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("data2.txt"));
		int n = s.nextInt(); 
		char[][] map = new char[n][n];
		
		// ÀÔ·Â
		for (int r=0;r<n;++r) {
			for(int c=0;c<n;++c) {
				map[r][c]=s.next().charAt(0);

			}
		}
		//Ã³¸®
		
		int max = 0;
		int aa = 0;
		int bb = 0;
				
				
		for (int r=1;r<n-1;++r) {
			for(int c=1;c<n-1;++c) {
				char me = map[r][c];
				char up = map[r-1][c];
				char down = map[r+1][c]; 
				char right = map[r][c+1];
				char left = map[r][c-1];
				char uple = map[r-1][c-1];
				char downle = map[r+1][c-1]; 
				char upri = map[r-1][c+1];
				char downri = map[r+1][c+1];
				
				if (me=='B' && up=='B' && down=='B' && right=='B' && left=='B' &&
						uple=='B' && downle=='B' && upri=='B' && downri=='B'){
							int count = 1; 
							for(int a=c+1;a<n;++a) {
								if(map[r][a]=='B') count++;
								else break;
							}
							for(int a=c-1;a>=0;--a) {
								if(map[r][a]=='B') count++;
								else break;
							}
							for(int a=r+1;a<n;++a) {
								if(map[a][c]=='B') count++;
								else break;
							}
							for(int a=r-1;a>=0;--a) {
								if(map[a][c]=='B') count++;
								else break;
							}
							if (count > max) {
								max = count;
								aa = r;
								bb = c;
							}						
				}//end if		
			}//end for1
		}// end for2 
		
		// Ãâ·Â
		System.out.println("°¡Àå ³ôÀº ºôµùÀÇ ³ôÀÌ:" + max);
		System.out.println("ÁÂÇ¥:"+aa+"Çà"+bb+"¿­");

	}

}
