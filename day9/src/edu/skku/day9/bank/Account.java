package edu.skku.day9.bank;
// �Ա� �ٽ� ���� �ٸ���� ���忡 �Ա�
public class Account {
	String num;
	long balance;
	int pwd;
	
	public void depostit(int money) {
		balance+=money;
		System.out.println(num+" �� ���忡 "+money+" ���� �ԱݵǾ����ϴ�.");
		System.out.println(num+" �� ���� �ܾ��� "+balance+" �Դϴ�.");
	}//end deposit
	
	public void withdraw(int money,int pw) {
		//��й�ȣ
		//�ܾ�üũ
		if(pw!=pwd) {
			if (money>balance) {
				balance-=money;
				System.out.println(money+" ���� ��ݵǾ����ϴ�.");
				System.out.println(num+" �� ���� �ܾ��� "+balance+" �Դϴ�.");
			}else System.out.println("�ܾ��� �����մϴ�.");
		}else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		
	} //end withdraw
	
	public void transfer(int otherNum, int pw, int money) {
		withdraw(pw,money);
		//�ٸ� ���� �Ա�
	}

}
