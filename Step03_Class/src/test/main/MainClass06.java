package test.main;

import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * System Ŭ������ out �̶�� static �ʵ忡 ��� ��������
		 * PrintStream type ���� ������ ���
		 * ���������� ��� �������� . �� println() �޼ҵ� ȣ���ؼ� �ܼ�â�� ���ڿ� ����ϱ�
		 */
		PrintStream a=System.out;
		a.println("hi~");
		
		//PrintStream b = new PrintStream(a);
	}
}
