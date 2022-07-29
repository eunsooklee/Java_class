package test.main;

import test.mypac.Arrow;
import test.mypac.Gun;
import test.mypac.MyObject;
import test.mypac.Radio;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		obj.setNum(0);
		obj.setName("kim");
		Radio r=new Radio();
		obj.useRadio(r);
		obj.useRadio(new Radio());
		obj.useRadio2();
		
		//attack() 메소드를 호출
		obj.attack(new Gun(),new Arrow());
	}
}
