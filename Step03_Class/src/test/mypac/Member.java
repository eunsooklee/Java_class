package test.mypac;
/*
 *  Member ��ü�� ȸ���� ��ȣ, �̸�, �ּҸ� ��� �ʹٸ�
 *  Ŭ������ ��� ���踦 �ؾ� �ұ�?
 *  
 *  �����(�ʵ�)�� 3�� �ʿ��ϴ�
 *  �ʵ��� type�� int, String, String
 */

public class Member {
	public int num;
	public String name;
	public String addr="";
    //�ʵ�� �ʱ�ȭ �ڵ����� �ż� ���� ����
	
	//�޼ҵ�
	public void showInfo() {
		//this �� ��ü �ڽ��� �������� ����Ű�� �����
		System.out.println("��ȣ:"+this.num+" �̸�:"+this.name+" �ּ�:"+this.addr);
		//this�� ���� ���������� �޼ҵ� �ȿ� ������ ������ ������ ���� ����Ѵ�.
		//�����̸��� ������ this�� �Ⱦ��� �޼ҵ� �ȿ� ������ ����Ų��
		//f5�� ������ ������ �����ؼ� ���� �� �ִ�.
	}
}
