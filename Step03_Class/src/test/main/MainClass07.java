package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		// Random type �������� ��� �� �ִ� ran �̶�� �̸��� �� �������� �����
		Random ran=null;
		// Random ��ü�� �����ؼ� �� �������� �������� ran�� �����ϱ�
		ran=new Random();
		// �������� . �� nextInt() �޼ҵ带 ȣ���ϰ� �޼ҵ尡 �������ִ� ����...
		int ranNum=ran.nextInt();
		// �ܼ�â�� ���
		System.out.println(ranNum);
	}

}
