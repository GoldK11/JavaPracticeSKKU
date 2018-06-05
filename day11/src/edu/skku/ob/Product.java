package edu.skku.ob;
/**
 * 문서화 가능한 주석
 * 상품 정보를 저장하는 클래스
 * @author aa (컴퓨터 이름)
 * 2017 11 14
 *
 */
public class Product {

	/** 상품 코드, 4저리 */
	int pcode; //member variable
	String pname;
	int price;
	int quant;
	String pdesc="";
	
	// 기능
	public Product() {}
	// test에서 속성을 하나하나 정의하기 귀찮으니까  한번에 넣어주려고 이렇게 정의 
	// Product pn = new Product(속성1,속성2,속성3,속성4) 이렇게 한번에 써줄 수 있다
	public Product(	int pcode, String pname, int price, int quant)//local variable
	{	this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.quant = quant; // member와 local 혼동으 막기 위해 member는 this. 으로 부른다
		this.pdesc = ""; // pdesc는 안가져왔기 때문에 이 안에서 정의해준다
	}

	/** 저장된 상품 정보를 출력해주는 메서드 */	
	public void info() {
		System.out.println("상품명: "+pname+", 가격: "+price);
		
	}
	// 내가 가지고있는 정보를 스트링으로 바꿔줄게
	public String toString() {
		String msg="상품명: "+pname+", 가격: "+price;
		return msg;		
	}

}
