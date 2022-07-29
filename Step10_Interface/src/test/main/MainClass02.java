package test.main;

import test.mypac.Remocon;

public class MainClass02 {
	// Remocon �������̽��� ������ inner class
	static class YourRemocon implements Remocon{

		@Override
		public void up() {
			System.out.println("���� ��");
		}

		@Override
		public void down() {
			System.out.println("���� �ٿ�");
		}

	}
	
	public static void main(String[] args) {
		Remocon r1=new YourRemocon();
		useRemocon(r1);
	}
	
	//Remocon �������̽� type�� ���ڷ� ���޹޴� static �޼ҵ�
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
