package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		//1. MacBook ��ü�� �����ؼ� �������� mac1 �̶�� ���� ������ ��� ������
		MacBook mac1 =new MacBook(new Cpu(), new Memory(), new HardDisk());
		
		//2. mac1 ���������� ����ִ� �������� �̿��ؼ� doGame() �޼ҵ带 ȣ���ؼ� ������ �� ������.
		mac1.doGame();
	}
}
