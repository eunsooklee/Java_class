package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		//Car ��ü�� �������� ���� 
		new MyObject().getCar().drive();
		
		MyObject obj=new MyObject();
		Car car1=obj.getCar();
		car1.drive();
		//Car car1=null;
		//car1=new Car(); //�����ڿ� public ������ �Ұ���
		/*public ��� ������Ű���� MyObject���� ����
		 * public Car getCar(){
		 * return new Car();
		 * }
		 */

	}
}
