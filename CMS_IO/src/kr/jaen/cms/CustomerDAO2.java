package kr.jaen.cms;

import java.io.*;
/** ���� ����Ÿ�� ����, �����ϴ� Ŭ���� */
public class  CustomerDAO2{
	private Customer[] list= new Customer[100];
	private  int index=0;
	
	public CustomerDAO2(){
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
				list[index++]=(Customer)ob;
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
			for(int i=0; i<index; i++){
				oos.writeObject(list[i]);
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
		Customer[]  re=new Customer[index];
		for(int i=0;i<index;i++){
			re[i]=list[i];
		}
		return re;
	}
	/** ���޵� ���� ������ �߰��Ѵ�.*/
	public void addCust( int num, String name,String address){
		list[index] = new Customer(num,name,address);
		index++;
	}


	/** �̸� �˻� �޼ҵ�*/
	public Customer search(String name){
		for (int i=0;i<index;i++) {
			//if (name==list[i].getName()) return list[i]; String�� ��ü�� �ּҷ� ���⶧���� �ּҺ��ؼ� �ȵƴ�
			if (name.equals(list[i].getName())) return list[i];
		}
		return null;	
	}
	
	/** ��ȣ �˻� �޼ҵ�*/
	public Customer search(int num){
		for (int i=0;i<index;i++) {
			if (num==list[i].getNum())	return list[i];
		}
		return null;
	}
	
	/** �̸� �˻�, ���� �޼ҵ� */
	// ������ ����� ����
	public void delete(String name){
		for (int i=0;i<index;i++) {
			if (name.equals(list[i].getName())) {
				list[i] = list[index-1];
				index--;
				break;
			}
		}
	}
	
	/** ��ȣ�� �˻�, ���� �޼ҵ�*/
	//������ �ȹٲٰ�ʹ�
	public void delete(int num){
		for (int i=0;i<index;i++) {
			if (num==list[i].getNum()) {
				for (int n=i;n<index-1;n++) {
					list[n] = list[n+1];
				}
				index--;
				break;
						
			}
		}
	}
	
	/** ��ȣ�� �˻��Ͽ� �̸�,�ּҸ� �����Ѵ�. */
	public void updateCust(int num, String name,String address){
		Customer cu = search(num);
		if(cu!=null) {
			cu.setAddress(address);
			cu.setName(name);
		}
		
	}
}
