package edu.skku.util;

public class Mydate {
	private int year;
	private int month;
	private int day; //변수 접근 금지 변수는 모두 이렇게 프라이빗 해주는게 좋다 

	//private 접근 통로 만들어주기
	public void setYear(int year) {  // 직접 넣지 말고 나를 주면 확인해보고 세팅해줄게
		if (year>2000 && year<3000) {
			this.year = year;
		}else {
			System.out.println("년도 오류");
		}
	}
	public void setMonth(int month) {
		if (month>=1 && month<=12) {
			this.month = month;
		}else {
			System.out.println("월 오류");
		}
	}
	public void setDay(int day) {
		if (day>=1 && day<=31) {
			this.day = day;
		}else {
			System.out.println("일 오류");
		}
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	public Mydate() {}
	public Mydate(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	public Mydate(int month, int day) {
		this.year = 2017;
		this.month = month;
		this.day= day;
	}	
	public String toString() {
		return year+"년 "+month+"월 "+day+"일";				
	}
}
