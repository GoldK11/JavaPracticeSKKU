package edu.skku.util;

public class Mydate {
	private int year;
	private int month;
	private int day; //���� ���� ���� ������ ��� �̷��� �����̺� ���ִ°� ���� 

	//private ���� ��� ������ֱ�
	public void setYear(int year) {  // ���� ���� ���� ���� �ָ� Ȯ���غ��� �������ٰ�
		if (year>2000 && year<3000) {
			this.year = year;
		}else {
			System.out.println("�⵵ ����");
		}
	}
	public void setMonth(int month) {
		if (month>=1 && month<=12) {
			this.month = month;
		}else {
			System.out.println("�� ����");
		}
	}
	public void setDay(int day) {
		if (day>=1 && day<=31) {
			this.day = day;
		}else {
			System.out.println("�� ����");
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
		return year+"�� "+month+"�� "+day+"��";				
	}
}
