package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		Member m1=new Member(1, "lee", "s");
		Member m2=new Member(2, "kim", "g");
		Member m3=new Member(3, "park", "p");
		
		new Member();
		Member m4=new Member();
		//default 생성자를 이용해서 객체를 생성하면 field에는 기본값이 들어 있다.
	}
}
