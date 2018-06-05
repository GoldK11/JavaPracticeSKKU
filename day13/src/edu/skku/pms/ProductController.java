package edu.skku.pms;

public class ProductController {

	public static void main(String[] args) {
		
		ProductManager mgr = new ProductManager();
		Product p = new Product(1001,"SmartTV",300,10);
		mgr.add(p);
		mgr.add(new Product(0,"SmartRFG",200,5));
		mgr.add(new Product(3001,"Styler",130,6));
		mgr.search();
		mgr.searchPrice(200);
		mgr.searchPrice(90);
		mgr.buy(1001, 2);
		mgr.search();
		mgr.sell(3001, 3);
		mgr.search();
		mgr.sell(2001, 6);
		mgr.search();
		System.out.println(mgr.getProductCount());
		System.out.println(mgr.getTotalAmount());

	}

}
