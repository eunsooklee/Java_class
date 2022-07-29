package test.mypac;

public class MyRemocon implements Remocon{
	//interface는 추상클래스와 달리 여러개 구현 가능
	@Override
	public void up() {
		System.out.println("채널을 올려요!");
	}

	@Override
	public void down() {
		System.out.println("채널을 내려요!");
	}

}
