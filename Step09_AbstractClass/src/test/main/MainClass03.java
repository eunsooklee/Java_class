package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
//import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		// 1.Zoo ��ü ���� z ���� ������ ���
		Zoo z=new Zoo();
		// 2.m1�� �޼ҵ� ���ϰ� ���
		Monkey m1 = z.getMonkey();
		
		// 3. say() �޼ҵ� ȣ��
		m1.say();
		
		Zoo.Tiger t1=z.getTiger(); // test.mypac.Zoo �տ� ���̸� import���ص� ��
		t1.say();
		// �޼ҵ� �ȿ��� Ŭ������ ���� �� �� �ִ�. �ش� �޼ҵ� �ȿ����� ����� �� �ִ�.
		//inner class, local innerclass
		class Lee{
			public void say() {
				System.out.println("Hi I'm lee");
			}
		}
		Lee l1=new Lee();
		l1.say();
	}
}
