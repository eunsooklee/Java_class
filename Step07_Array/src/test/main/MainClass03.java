package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("����");
		//String type�� ���� �� �ִ� �� 3��¥�� �� �迭 ��ü�� ���� �������� �������� names�� ���
		String[] names=new String[3];
		names[0]="a";
		names[1]="b";
		names[2]="c";
		
		//�ݺ��� �迭 ���
		for(int i=0; i < names.length; i++) {
			String tmp=names[i];
			System.out.println(tmp);
			//System.out.println(names[i]);
		}
	}
}
