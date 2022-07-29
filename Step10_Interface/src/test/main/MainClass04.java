package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("���� ������ �վ��");
			}
		});
		
		useDrill(()->{
			System.out.println("�ٴڿ� ������ �վ��");
		});
		
		Drill d2=()->{
			System.out.println("õ�忡 ������ �վ��");
		};
		//Drill type �� �޼ҵ��� ���ڷ� �����ϱ�
		useDrill(d2);
		//Drill type�� �޼ҵ� ���� ȣ���ϱ�
		d2.hole();
		
		Drill d3=new Drill() {
			@Override
			public void hole() {
				System.out.println("d2�� �Ȱ��� ����");
			}
		};
	}
	
	//Drill �������̽� type�� ���ڷ� ���޹޴� �޼ҵ�
	public static void useDrill(Drill d) {
		d.hole();
	}
}
