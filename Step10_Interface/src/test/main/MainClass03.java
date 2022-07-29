package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			@Override
			public void up() {
				System.out.println("Ŀư ��");
			}
			@Override
			public void down() {
				System.out.println("Ŀư �ٿ�");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("��ġ�� �÷���");
			}
			@Override
			public void down() {
				System.out.println("��ġ�� ������");
			}
		});
	}
		
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
