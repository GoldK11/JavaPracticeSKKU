package edu.skku.pms;

public class ProductManager {
	Product[] ps = new Product[100];
	int index = 0;  //�迭�� ������ ���� ��ġ�� ���
	
	//��ǰ ���� ���
	public void add(Product p) {
		ps[index++] = p;  
		//++index �ϸ� ++���� �ؼ� 0������ ��� �Ǵµ� index++�� ���� ��� ���߿� �����ؼ� �̷��� �ᵵ ��
		//index++;				
	}
	
	//��ǰ ã��
	public void search() {
		System.out.println("======�˻�:��ü======");
		for (int i=0;i<index;i++) System.out.println(ps[i]);
	}
	public Product search(int pnum) {
		System.out.println("======�˻�:pnum "+pnum+"======");
		for (int i=0;i<index;i++) {
			if (ps[i].getPnum()==pnum) return ps[i];
		}
		return null;
	}
	public Product searchPrice(int price) {
		System.out.println("======�˻�:price "+price+"======");
		for (int i=0;i<index;i++) {
			if (ps[i].getPrice()<=price) {
				System.out.println(ps[i]);
			}
		}		
		return null;
	}
	
	//��ǰ ����
	public void buy(int pnum,int quant) {
		Product p = search(pnum);
		if(p!=null)	p.setQuant(p.getQuant()+quant);
		else System.out.println("There is no product. Plz call 'add' function");
	}
	
	//��ǰ �Ǹ�
	public void sell(int pnum,int quant) {
		Product p = search(pnum);
		if(p!=null) {
			if (0<=(p.getQuant()-quant))p.setQuant(p.getQuant()-quant);
			else System.out.println("You don't have enough products");
		}
		else System.out.println("There is no product");		
	}
	
	//��ǰ�� ��
	public int getProductCount() {
		System.out.println("====Product count====");
		return index;
	}
	
	//��� �ݾ�
	public int getTotalAmount() {
		System.out.println("====Total Amount====");
		int total = 0;
		for(int i=0;i<index;++i) {
			total+=ps[i].getPrice()*ps[i].getQuant();
		}
		return total;
	}

}
