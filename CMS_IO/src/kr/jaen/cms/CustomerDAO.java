package kr.jaen.cms;

import java.io.*;
import java.util.ArrayList;
/** 고객의 데이타를 관리, 저장하는 클래스 */
public class  CustomerDAO{
	private ArrayList<Customer> list= new ArrayList<>();
	
	public CustomerDAO(){
		open();
	}
	
	/** 파일로 부터 자료 읽어서 메모리(ArrayList)에 저장하기*/
	public void open(){
		ObjectInputStream ois=null;
		File file=new File("cust.dat");
		if (!file.exists()) { return; }
		try{	
			ois=new ObjectInputStream(new FileInputStream(file));
			Object ob=null;
			while((ob=ois.readObject())!=null){//마지막 EOF Exception발생
				list.add((Customer)ob); //꺼낸 ob를 Customer 형으로 바꿔서 넣어줭
			}
		}catch(EOFException fe){
			System.out.println("파일이 읽기 완료");
		}catch(Exception ioe){
			System.out.println("오류 발생 :"+ioe);
		}finally{
				try{
					if(ois !=null) ois.close();
				}catch(IOException oe){	System.out.println("파일을 닫는데 실패했습니다");	}
		}
	}
/** 종료하기 전에 메모리의 내용을 파일에 저장하기 */
	public void close(){
		ObjectOutputStream oos=null;
		try{
			oos=new ObjectOutputStream(	new FileOutputStream("cust.dat"));
			for(Customer cu: list){
				oos.writeObject(cu);
			}
		}catch(IOException ioe){
			System.out.println("파일 저장 하는데 실패하였습니다");
		}finally{
			try{
				if(oos!=null) oos.close();
			}catch(IOException oe){	System.out.println("파일을 닫는데 실패했습니다");	}
		}
	}
	/** 고객의 모든 정보를 리턴한다.*/
	public Customer[] allCust(){
		Customer[]  re=new Customer[list.size()];
		for(int i=0;i<list.size();i++){
			re[i]=list.get(i);
		}
		return re;
	}
	/** 전달된 고객의 정보를 추가한다.*/
	public void addCust( int num, String name,String address){
		list.add( new Customer(num,name,address));
	}


	/** 이름 검색 메소드*/
	public Customer search(String name){
		for (Customer cu: list) {
			if (name.equals(cu.getName())) return cu;
		}
		return null;	
	}
	
	/** 번호 검색 메소드*/
	public Customer search(int num){
		for (Customer cu: list) {
			if (num == cu.getNum()) return cu;
		}
		return null;
	}
	
	/** 이름 검색, 제거 메소드 */
	// 순서랑 상관이 없다
	public void delete(String name){
		Customer cu = search(name);
		list.remove(cu);
	}
	
	/** 번호를 검색, 제거 메소드*/
	//순서를 안바꾸고싶다
	public void delete(int num){
		list.remove(search(num));

	}
	
	/** 번호를 검색하여 이름,주소를 수정한다. */
	public void updateCust(int num, String name,String address){
		Customer cu = search(num);
		cu.setAddress(address);
		cu.setName(name);
	}
}
