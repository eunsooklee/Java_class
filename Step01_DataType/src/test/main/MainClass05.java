package test.main;
/*
 *  [java ���� ������ type]
 *  String type
 *  - ���ڿ��� �ٷ궧 ����ϴ� ������ type �̴�.
 */
public class MainClass05 {
	public static void main(String[] args) {
		// "�豸��" ��� String type ��ü�� heap ������ ����� �� �������� ������ ���
		String name="lee";
		// name �ȿ� �ִ� �������� tmp ������ ������ �ֱ�
		String tmp=name; // string�� �ڹٽ�ũ��Ʈ�� object�� ����ϴ�
		// "������" ��� String type ��ü�� heap ������ ����� �� �������� name ������ �����
		name="rooroo";
		//name ������ ���� (null�� ���� ������ type�� ��� �� �ִ� �� ����)
		name=null;
		
		int num=10;
		boolean isRun=true;
	} //��ü�� ���� ����� + ��� / �ڹٿ��� . = ��� ex)name.
}
