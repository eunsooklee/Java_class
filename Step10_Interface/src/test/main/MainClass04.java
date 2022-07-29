package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("벽에 구멍을 뚫어요");
			}
		});
		
		useDrill(()->{
			System.out.println("바닥에 구멍을 뚫어요");
		});
		
		Drill d2=()->{
			System.out.println("천장에 구멍을 뚫어요");
		};
		//Drill type 을 메소드의 인자로 전달하기
		useDrill(d2);
		//Drill type의 메소드 직접 호출하기
		d2.hole();
		
		Drill d3=new Drill() {
			@Override
			public void hole() {
				System.out.println("d2랑 똑같은 형식");
			}
		};
	}
	
	//Drill 인터페이스 type을 인자로 전달받는 메소드
	public static void useDrill(Drill d) {
		d.hole();
	}
}
