package test.mypac;

public class MyRemocon implements Remocon{
	//interface�� �߻�Ŭ������ �޸� ������ ���� ����
	@Override
	public void up() {
		System.out.println("ä���� �÷���!");
	}

	@Override
	public void down() {
		System.out.println("ä���� ������!");
	}

}
