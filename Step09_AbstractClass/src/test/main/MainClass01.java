package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 *  [ �߻�Ŭ���� (Abstract Class) ]
 *  
 *  - class ����� �տ� abstract �� ����ؼ� Ŭ������ �����Ѵ�.
 *  - ���¸� ���ǵǰ� ���� ������ ���� ���� �޼ҵ尡 �����Ҽ� 
 *    �ִ�.
 *  - ���¸� ���ǵ� �޼ҵ带 ���鶧�� abstract ���� 
 *    �پ �޼ҵ带 �����Ѵ�.
 *  - �����ڴ� ���������� �ܵ����� ��ü ������ �Ұ��ϴ�
 *  - �߻�Ŭ���� Type �� id �� �ʿ��ϴٸ� �߻�Ŭ������ ��ӹ��� 
 *    �ڽ�Ŭ������ �����ؼ� ��ü �����Ѵ�.
 *  - �߻�Ŭ������ ��ӹ��� �ڽ�Ŭ������ �θ��� �߻�޼ҵ带 
 *    ��� �������̵�(������) �ؾ��Ѵ�. 
 *
 */

public class MainClass01 {
	public static void main(String[] args) {
		Weapon w1 = new MyWeapon();
		MyWeapon w2 = new MyWeapon();
		w1.attack();
		w2.attack();
	}
}
