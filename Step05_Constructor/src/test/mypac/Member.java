package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	//�⺻ ������
	public Member() {
		System.out.println("�⺻ �����ڰ� ȣ��");
	}
	
	//�ʵ忡 ������ ���� ���� �޴� ������ 
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
		
	}
}
