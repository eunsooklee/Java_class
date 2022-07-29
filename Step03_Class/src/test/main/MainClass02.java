package test.main;

import test.mypac.Car;

public class MainClass02 {
	
	public static void main(String[] args) {
		// 시속 200km로 가자
		Car car1 = new Car();
		car1.drive();
		new Car().drive(); // 객체를 일회용으로 쓰는 법 
		
		Car car2 = new Car();
		
		String carName = car1.name;
	}
	
}
