package edu.skku.java2week;

public class Array2Test1 {

	public static void main(String[] args) {
		int[][] s = new int[3][5];
		s[0][0]=10;
		s[2][3]=20;
		s[1][2]=90;
		s[2][2]=20;
		
		for (int row=0;row<s.length;++row) {
			int sum =0;
			for (int col =0;col<s[row].length;++col) {
				System.out.print(s[row][col]+" ");
				sum=sum+s[row][col];
			}
			System.out.println(sum);
		}
	}

}
