package test.main;

import test.mypac.Member;

public class MainClass03 {
	public static void main(String[] args) {
		//static ������ �ö󰡴� class�� ��Ű���� �ϳ��� �ö󰣴� 
		//�ֳĸ� heap����ó�� ���������� ã�ư��°� �ƴ϶� Ŭ���������� ã�ư��� �����̴�
		//���� �ϳ��� ������ �Ǵ� Ŭ������ static���� �����
		//static �� new �� �����ʿ䰡 ���� Ŭ������.�� �ٷ� ����Ѵ�
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		Member mem1 = new Member();
		mem1.num=1;
		mem1.name="kim";
		mem1.addr="seoul";
		
		Member mem2 = new Member();
		mem2.num=2;
		mem2.name="nabi";
		mem2.addr="garden";
		
		//mem1, mem2 �� ����ִ� �������� �̿��ؼ� showInfo() �޼ҵ� ȣ���ϱ�
		mem1.showInfo();
		mem2.showInfo();
	}
}
