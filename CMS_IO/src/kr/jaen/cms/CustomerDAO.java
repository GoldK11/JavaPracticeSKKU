package kr.jaen.cms;

import java.io.*;
import java.util.ArrayList;
/** ���� ����Ÿ�� ����, �����ϴ� Ŭ���� */
public class  CustomerDAO{
	private ArrayList<Customer> list= new ArrayList<>();
	
	public CustomerDAO(){
		open();
	}
	
	/** ���Ϸ� ���� �ڷ� �о �޸�(ArrayList)�� �����ϱ�*/
	public void open(){
		ObjectInputStream ois=null;
		File file=new File("cust.dat");
		if (!file.exists()) { return; }
		try{	
			ois=new ObjectInputStream(new FileInputStream(file));
			Object ob=null;
			while((ob=ois.readObject())!=null){//������ EOF Exception�߻�
				list.add((Customer)ob); //���� ob�� Customer ������ �ٲ㼭 �־�a
			}
		}catch(EOFException fe){
			System.out.println("������ �б� �Ϸ�");
		}catch(Exception ioe){
			System.out.println("���� �߻� :"+ioe);
		}finally{
				try{
					if(ois !=null) ois.close();
				}catch(IOException oe){	System.out.println("������ �ݴµ� �����߽��ϴ�");	}
		}
	}
/** �����ϱ� ���� �޸��� ������ ���Ͽ� �����ϱ� */
	public void close(){
		ObjectOutputStream oos=null;
		try{
			oos=new ObjectOutputStream(	new FileOutputStream("cust.dat"));
			for(Customer cu: list){
				oos.writeObject(cu);
			}
		}catch(IOException ioe){
			System.out.println("���� ���� �ϴµ� �����Ͽ����ϴ�");
		}finally{
			try{
				if(oos!=null) oos.close();
			}catch(IOException oe){	System.out.println("������ �ݴµ� �����߽��ϴ�");	}
		}
	}
	/** ���� ��� ������ �����Ѵ�.*/
	public Customer[] allCust(){
		Customer[]  re=new Customer[list.size()];
		for(int i=0;i<list.size();i++){
			re[i]=list.get(i);
		}
		return re;
	}
	/** ���޵� ���� ������ �߰��Ѵ�.*/
	public void addCust( int num, String name,String address){
		list.add( new Customer(num,name,address));
	}


	/** �̸� �˻� �޼ҵ�*/
	public Customer search(String name){
		for (Customer cu: list) {
			if (name.equals(cu.getName())) return cu;
		}
		return null;	
	}
	
	/** ��ȣ �˻� �޼ҵ�*/
	public Customer search(int num){
		for (Customer cu: list) {
			if (num == cu.getNum()) return cu;
		}
		return null;
	}
	
	/** �̸� �˻�, ���� �޼ҵ� */
	// ������ ����� ����
	public void delete(String name){
		Customer cu = search(name);
		list.remove(cu);
	}
	
	/** ��ȣ�� �˻�, ���� �޼ҵ�*/
	//������ �ȹٲٰ�ʹ�
	public void delete(int num){
		list.remove(search(num));

	}
	
	/** ��ȣ�� �˻��Ͽ� �̸�,�ּҸ� �����Ѵ�. */
	public void updateCust(int num, String name,String address){
		Customer cu = search(num);
		cu.setAddress(address);
		cu.setName(name);
	}
}
