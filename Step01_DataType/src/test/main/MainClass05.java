package test.main;
/*
 *  [java 참조 데이터 type]
 *  String type
 *  - 문자열을 다룰때 사용하는 데이터 type 이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		// "김구라" 라는 String type 객체를 heap 영역에 만들고 그 참조값을 변수에 담기
		String name="lee";
		// name 안에 있는 참조값을 tmp 변수에 복사해 주기
		String tmp=name; // string은 자바스크립트의 object와 비슷하다
		// "원숭이" 라는 String type 객체를 heap 영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name="rooroo";
		//name 변수를 비우기 (null은 참조 데이터 type이 담길 수 있는 빈 공간)
		name=null;
		
		int num=10;
		boolean isRun=true;
	} //객체는 값의 저장소 + 기능 / 자바에서 . = 기능 ex)name.
}
