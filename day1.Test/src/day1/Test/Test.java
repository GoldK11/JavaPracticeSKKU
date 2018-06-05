package day1.Test;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test {
 public static void main(String[] args) {
	
	int a = 10;  // 변수!
	int b = 35;
	double c = 100.0 / 3.0 ;
	float d = 3.2f ;
	String x = "hello";
	
	int result = 0;
	result = a + b;
	System.out.println(result);  //println : 줄바꿈
	result = a - b;
	System.out.println(result);
	result = a * b;
	System.out.println(result);
	result = b / a;			// / 나누기의 몫(정수값)
	System.out.println(result);
	result = b % a;			//% 나누기의 나머지 값
	System.out.println(result);   // sysout ctrl + space > 자동완성
	System.out.println(c);
	System.out.println(d);
	System.out.println(x);
	

}
}
