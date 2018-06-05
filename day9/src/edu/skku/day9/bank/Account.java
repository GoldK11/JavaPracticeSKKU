package edu.skku.day9.bank;
// 입금 다시 보자 다른사람 통장에 입금
public class Account {
	String num;
	long balance;
	int pwd;
	
	public void depostit(int money) {
		balance+=money;
		System.out.println(num+" 의 통장에 "+money+" 원이 입금되었습니다.");
		System.out.println(num+" 의 현재 잔액은 "+balance+" 입니다.");
	}//end deposit
	
	public void withdraw(int money,int pw) {
		//비밀번호
		//잔액체크
		if(pw!=pwd) {
			if (money>balance) {
				balance-=money;
				System.out.println(money+" 원이 출금되었습니다.");
				System.out.println(num+" 의 현재 잔액은 "+balance+" 입니다.");
			}else System.out.println("잔액이 부족합니다.");
		}else System.out.println("비밀번호가 틀렸습니다.");
		
	} //end withdraw
	
	public void transfer(int otherNum, int pw, int money) {
		withdraw(pw,money);
		//다른 통장 입금
	}

}
