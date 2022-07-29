package test.main;

import test.mypac.MagicWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//new MainClass02().useWeapon();
		Weapon mw = new MagicWeapon();
		MainClass02.useWeapon(mw);
	}

	//public void useWeapon() { //heap영역에 만들어짐}
	//이 메소드는 미리 준비된 메소드이고 아주 특별한 동작을 하는 메소드라고 가정하자
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		System.out.println("잠시 휴식 후...");
		w.attack();
		
	}
}