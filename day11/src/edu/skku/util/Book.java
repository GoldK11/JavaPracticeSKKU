package edu.skku.util;
//개꿀팁 마우스 오른쪽 버튼 >> source >> generate 기능 쓰자
public class Book {
	private String num;
	private String model;
	private int price;
	
	public Book() {
		//super();
	}

	public Book(String num, String model, int price) {
		this.num = num;
		this.model = model;
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [num=" + num + ", model=" + model + ", price=" + price + "]";
	}
	
	
	

}
