package edu.skku.ob;
/**
 * ����ȭ ������ �ּ�
 * ��ǰ ������ �����ϴ� Ŭ����
 * @author aa (��ǻ�� �̸�)
 * 2017 11 14
 *
 */
public class Product {

	/** ��ǰ �ڵ�, 4���� */
	int pcode; //member variable
	String pname;
	int price;
	int quant;
	String pdesc="";
	
	// ���
	public Product() {}
	// test���� �Ӽ��� �ϳ��ϳ� �����ϱ� �������ϱ�  �ѹ��� �־��ַ��� �̷��� ���� 
	// Product pn = new Product(�Ӽ�1,�Ӽ�2,�Ӽ�3,�Ӽ�4) �̷��� �ѹ��� ���� �� �ִ�
	public Product(	int pcode, String pname, int price, int quant)//local variable
	{	this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.quant = quant; // member�� local ȥ���� ���� ���� member�� this. ���� �θ���
		this.pdesc = ""; // pdesc�� �Ȱ����Ա� ������ �� �ȿ��� �������ش�
	}

	/** ����� ��ǰ ������ ������ִ� �޼��� */	
	public void info() {
		System.out.println("��ǰ��: "+pname+", ����: "+price);
		
	}
	// ���� �������ִ� ������ ��Ʈ������ �ٲ��ٰ�
	public String toString() {
		String msg="��ǰ��: "+pname+", ����: "+price;
		return msg;		
	}

}
