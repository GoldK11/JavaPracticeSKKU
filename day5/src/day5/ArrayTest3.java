package day5;
// ���ο� for each�� ����ϱ�
public class ArrayTest3 {

	public static void main(String[] args) {
		int []ks = {5,4,6,8,-10,2,-5,3,7,9};
		int min = ks[0];
		int index = 0;
		for (int i=1;i<ks.length;++i) {
			if(min>ks[i]) {
				min = ks[i];
				index = i;
			}//end if
		}//end for
		
		System.out.println("�ּڰ�: "+min );
		System.out.println("�ּҰ��� ��ġ: "+index);
		
		for (int i=0;i<ks.length;++i) {
			System.out.print(ks[i]+" ");
		}//end for
		System.out.println();
		
		//���ο� for-each ��
		for (int k : ks) {
			System.out.print(k+" ");			
		}
		

	}//end main

}//end class
