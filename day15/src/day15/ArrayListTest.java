package day15;

import java.util.ArrayList;
//��ü���� �����ϰ� �������� >> �⺻ Ÿ���� ������ �ȵǰ� ��üŸ��(class)�� �ٲ��� ����ȴ�

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList(100); �迭 ũ�Ⱑ 100���� ���������		
		ArrayList<Integer> list= new ArrayList<>(); // �迭 ũ�Ⱑ �⺻���� 10���� ���������
		// <> �ȿ� Ÿ�� ǥ�� ���ϸ� Ÿ�� ������� �ƹ��ų� ���� �� ������ ���� Ÿ�� �������� ��Ȯ�ϰ� ǥ�� �ϴ°� ������
		list.add(100); //list.add(new Integer(100)); �̷��� �ڵ����� �ٲ���
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		
		for(int value :list) { 
			//�� �� classŸ��(��ü)�� �ٲ㼭 ���� ������ ���� �� int�� �ٲ㼭 �����޶�� �ؾߵȴ�
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
