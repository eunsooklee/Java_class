package test.main;
//1. ��ü�� �����ϴµ� �ʿ��� Ŭ���� import 
import test.mypac.Calculator;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * ���� ���α׷����� ������ '���' �̶��?
		 * - ������� �����Ҽ� �ִ� ��ü�� �ʿ��ϴ�.
		 * - ������� �����Ҽ� �ִ� ��ü�� �����ؼ� heap ������ �÷�����
		 * - �������� �̿��ؼ� ����� �ؾ��Ѵ�.
		 */
		
		//2. ��ü�� �����Ѵ�. = heap������ ��ü�� ������, �繰�Թ�ȣ �Ҵ� 
		Calculator cal = new Calculator(); //cal=��ü�������� Calculator=��뼳��
		//Calculator ��ü�� exec() �޼ҵ� ȣ���ϱ�
		cal.exec();
		cal.exec();
		
		//Calculator ��ü��(27�� �繰���� 28�� �ʵ� ��ȣ �������) brand �ʵ� �����ϱ�
		String a=cal.brand; //(28�� �ʵ� ��ȣ��)������ ���� ������ �����ϱ�
	}
}
