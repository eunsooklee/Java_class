package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		Weapon w1=new Weapon() {	
			@Override
			public void attack() {
				System.out.println("weapon ��ӹ��� �͸��� Ŭ������ ������");
			}
		};
		useWeapon(w1);
		
		//�������� ������ �ʰ� �ٷ� �͸�Ŭ������ ��ü������ ������ �����ϱ�
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
