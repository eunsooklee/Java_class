package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 객체의 참조값을 얻어내서 
		new MyObject().getCar().drive();
		
		MyObject obj=new MyObject();
		Car car1=obj.getCar();
		car1.drive();
		//Car car1=null;
		//car1=new Car(); //생성자에 public 없으면 불가능
		/*public 없어도 같은패키지인 MyObject에서 가능
		 * public Car getCar(){
		 * return new Car();
		 * }
		 */

	}
}
