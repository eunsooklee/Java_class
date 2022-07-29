package test.main;

import test.mypac.Member;

public class MainClass03 {
	public static void main(String[] args) {
		//static 영역에 올라가는 class는 패키지당 하나만 올라간다 
		//왜냐면 heap영역처럼 참조값으로 찾아가는게 아니라 클래스명으로 찾아가기 때문이다
		//따라서 하나만 있으면 되는 클래스는 static으로 만든다
		//static 은 new 를 만들필요가 없고 클래스명에.찍어서 바로 사용한다
		System.out.println("main 메소드가 시작 되었습니다.");
		Member mem1 = new Member();
		mem1.num=1;
		mem1.name="kim";
		mem1.addr="seoul";
		
		Member mem2 = new Member();
		mem2.num=2;
		mem2.name="nabi";
		mem2.addr="garden";
		
		//mem1, mem2 에 들어있는 참조값을 이용해서 showInfo() 메소드 호출하기
		mem1.showInfo();
		mem2.showInfo();
	}
}
