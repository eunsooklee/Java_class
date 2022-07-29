package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
//import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		// 1.Zoo 객체 생성 z 지역 변수에 담기
		Zoo z=new Zoo();
		// 2.m1에 메소드 리턴값 담기
		Monkey m1 = z.getMonkey();
		
		// 3. say() 메소드 호출
		m1.say();
		
		Zoo.Tiger t1=z.getTiger(); // test.mypac.Zoo 앞에 붙이면 import안해도 됨
		t1.say();
		// 메소드 안에도 클래스를 정의 할 수 있다. 해당 메소드 안에서만 사용할 수 있다.
		//inner class, local innerclass
		class Lee{
			public void say() {
				System.out.println("Hi I'm lee");
			}
		}
		Lee l1=new Lee();
		l1.say();
	}
}
