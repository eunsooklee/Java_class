package test.main;

import test.mypac.Car;

public class MainClass02 {
	
	public static void main(String[] args) {
		// �ü� 200km�� ����
		Car car1 = new Car();
		car1.drive();
		new Car().drive(); // ��ü�� ��ȸ������ ���� �� 
		
		Car car2 = new Car();
		
		String carName = car1.name;
	}
	
}
