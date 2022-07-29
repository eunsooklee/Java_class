package test.main;

import test.mypac.MagicWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//new MainClass02().useWeapon();
		Weapon mw = new MagicWeapon();
		MainClass02.useWeapon(mw);
	}

	//public void useWeapon() { //heap������ �������}
	//�� �޼ҵ�� �̸� �غ�� �޼ҵ��̰� ���� Ư���� ������ �ϴ� �޼ҵ��� ��������
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		System.out.println("��� �޽� ��...");
		w.attack();
		
	}
}