package edu.skku.pms;

public class ProductManager {
	Product[] ps = new Product[100];
	int index = 0;  //배열의 데이터 저장 위치를 기억
	
	//상품 저장 기능
	public void add(Product p) {
		ps[index++] = p;  
		//++index 하면 ++먼저 해서 0번방이 비게 되는데 index++은 먼저 담고 나중에 증가해서 이렇게 써도 됨
		//index++;				
	}
	
	//상품 찾기
	public void search() {
		System.out.println("======검색:전체======");
		for (int i=0;i<index;i++) System.out.println(ps[i]);
	}
	public Product search(int pnum) {
		System.out.println("======검색:pnum "+pnum+"======");
		for (int i=0;i<index;i++) {
			if (ps[i].getPnum()==pnum) return ps[i];
		}
		return null;
	}
	public Product searchPrice(int price) {
		System.out.println("======검색:price "+price+"======");
		for (int i=0;i<index;i++) {
			if (ps[i].getPrice()<=price) {
				System.out.println(ps[i]);
			}
		}		
		return null;
	}
	
	//상품 구입
	public void buy(int pnum,int quant) {
		Product p = search(pnum);
		if(p!=null)	p.setQuant(p.getQuant()+quant);
		else System.out.println("There is no product. Plz call 'add' function");
	}
	
	//상품 판매
	public void sell(int pnum,int quant) {
		Product p = search(pnum);
		if(p!=null) {
			if (0<=(p.getQuant()-quant))p.setQuant(p.getQuant()-quant);
			else System.out.println("You don't have enough products");
		}
		else System.out.println("There is no product");		
	}
	
	//상품의 수
	public int getProductCount() {
		System.out.println("====Product count====");
		return index;
	}
	
	//재고 금액
	public int getTotalAmount() {
		System.out.println("====Total Amount====");
		int total = 0;
		for(int i=0;i<index;++i) {
			total+=ps[i].getPrice()*ps[i].getQuant();
		}
		return total;
	}

}
