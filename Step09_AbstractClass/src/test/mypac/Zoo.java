package test.mypac;

public class Zoo {
	int num=999;
	/*
	 * Ŭ���� �ȿ� ���� �� �� �ִ� ��?
	 * ������, �ʵ�, �޼ҵ�, Ŭ����
	 */
	//Ŭ���� �ȿ� Ŭ����(���� Ŭ����)
	public class Monkey{
		public void say() {
			System.out.println("Hi! I'm BaBa");
		}
	}
	//���� Ŭ����
	public class Tiger{
		public void say() {
			System.out.println("Hi! I'm tiger");
		}
	}
	//�޼ҵ�
	public Monkey getMonkey() { //���� Ŭ������ ��ü�� �����ؼ� �������ִ� �޼ҵ�
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
}
