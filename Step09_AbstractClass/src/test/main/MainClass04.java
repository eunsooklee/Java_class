package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	/*
	 * Weapon �߻�Ŭ������ ��ӹ��� inner class
	 * main() �޼ҵ�� static �޼ҵ� �̱� ������ main() �޼ҵ忡�� ����Ϸ���
	 * inner class �� static ������ �ö� �־�� �ϱ� ������ static ���� �ʿ��ϴ�
	 */
	static class Gun extends Weapon{
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("��");
			}
		}
	
	public static void main(String[] args) {
		Weapon w1=new Gun();
		useWeapon(w1);
		//local inner class
		class Missile extends Weapon{
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("�̻��� ����");
			}
		}
		Weapon w2=new Missile();
		useWeapon(w2);
		
		//��ü�� �����ؼ� ���������� ���� �ʰ� �ٷ� �����ؼ� useWeapon() �޼ҵ� ȣ���ϱ�
		useWeapon(new Missile());
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
