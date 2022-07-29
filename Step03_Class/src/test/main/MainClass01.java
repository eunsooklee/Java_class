package test.main;
//1. 객체를 생성하는데 필요한 클래스 import 
import test.mypac.Calculator;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 만일 프로그래밍의 목적이 '계산' 이라면?
		 * - 계산기능을 수행할수 있는 객체가 필요하다.
		 * - 계산기능을 수행할수 있는 객체를 생성해서 heap 영역에 올려놓고
		 * - 참조값을 이용해서 계산을 해야한다.
		 */
		
		//2. 객체를 생성한다. = heap영역에 객체의 참조값, 사물함번호 할당 
		Calculator cal = new Calculator(); //cal=객체의참조값 Calculator=사용설명서
		//Calculator 객체의 exec() 메소드 호출하기
		cal.exec();
		cal.exec();
		
		//Calculator 객체의(27번 사물함의 28번 필드 번호 들어있음) brand 필드 참조하기
		String a=cal.brand; //(28번 필드 번호값)참조된 값을 변수에 대입하기
	}
}
