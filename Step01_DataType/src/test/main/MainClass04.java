package test.main;
/*
 *  [java 기본 데이터 type]
 *  2. 문자형 (char)
 *  - 65536 가지의 코드값을 가질 수 있다.
 *  - 전 세계에서 사용하는 모든 문자 1글자를  표현할 수 있다.
 *  - single quotation을 이용해서 만든다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//char형 변수 선언과 동시에 값 대입하기
		char ch1='a';
		char ch2='b';
		char ch3='c';
		char ch4='가';
		char ch5='나';
		char ch6='다';
		char ch7='@';
		
		//정수값에 1:1 대응되는 char 값이 존재한다.
		int code1=ch1;
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
		int code5=ch5;
		int code6=ch6;
		int code7=ch7;
	}
	// char은 short타입 java primitive data type은 8개이다. 
	// string문자열 안에는 문자가 아니라 문자가 들어있는 번호만 들어있다. 따라서 참조 데이터이다.
	// (객체)값을 저장하는 공간 field(전역변수같은거) 기능 method
	// 사물함에 저장돼있는 객체?
	

}
