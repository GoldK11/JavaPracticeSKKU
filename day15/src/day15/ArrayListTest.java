package day15;

import java.util.ArrayList;
//객체들을 저장하고 관리해줌 >> 기본 타입은 저장이 안되고 객체타입(class)로 바껴서 저장된다

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList(100); 배열 크기가 100부터 만들어진다		
		ArrayList<Integer> list= new ArrayList<>(); // 배열 크기가 기본으로 10부터 만들어진다
		// <> 안에 타입 표기 안하면 타입 상관없이 아무거나 넣을 수 있지만 무슨 타입 넣을건지 명확하게 표기 하는걸 권장함
		list.add(100); //list.add(new Integer(100)); 이렇게 자동으로 바꿔줌
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		
		for(int value :list) { 
			//들어갈 때 class타입(객체)로 바꿔서 들어갔기 때문에 꺼낼 때 int로 바꿔서 꺼내달라고 해야된당
			System.out.print(value+" ");
		}
		list.remove(2);
		
		System.out.println();
		
		for(int value: list) {
			System.out.print(value+" ");
		}
		
		System.out.println();
		
		System.out.println(list.get(2));
		
		System.out.println(list.size());
		
		System.out.println(list.contains(500));
		
		System.out.println(list.contains(300));
		

	}

}
