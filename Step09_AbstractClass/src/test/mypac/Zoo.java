package test.mypac;

public class Zoo {
	int num=999;
	/*
	 * 클래스 안에 정의 할 수 있는 것?
	 * 생성자, 필드, 메소드, 클래스
	 */
	//클래스 안에 클래스(내부 클래스)
	public class Monkey{
		public void say() {
			System.out.println("Hi! I'm BaBa");
		}
	}
	//내부 클래스
	public class Tiger{
		public void say() {
			System.out.println("Hi! I'm tiger");
		}
	}
	//메소드
	public Monkey getMonkey() { //내부 클래스로 객체를 생성해서 리턴해주는 메소드
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
}
