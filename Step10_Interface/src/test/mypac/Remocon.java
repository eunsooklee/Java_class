package test.mypac;

/*
 *  [ interface ]
 *  
 *  - �����ڰ� ���� (�ܵ� ��ü ���� �Ұ�)
 *  - ������ �޼ҵ�� ������ ���� ( �߻� �޼ҵ常 ������ �ִ� )
 *  - �ʵ�� static final ����� ������ �ִ�.
 *  - data type  �� ��Ȱ�� �Ҽ� �ִ�.
 *  - interface type �� �������� �ʿ��ϸ� ����(implements) Ŭ������ ����
 *    ��ü�� �����ؾ� �Ѵ�.
 *  - Ŭ���� ����� ���� ���������, �������̽��� ���� ������ �����ϴ� 
 */

//abstract�� �Ƚᵵ �ȴ�
public interface Remocon {
	/*
	 * �ʵ�� static final �ʵ常 ���� �� �ִ�. (static final ��������)
	 */
	public static final String COMPANY="LG";
	//�߻� �޼ҵ常 ���� �� �� �ִ�.
	public void up();
	public void down();
	//interface�� ������Ÿ�� ������ �����ϴ�
	
}
