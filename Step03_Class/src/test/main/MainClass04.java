package test.main;

import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * MyUtil Ŭ������ �ִ� send() �޼ҵ带 ȣ���ϰ� �ʹٸ�?
		 * static �޼ҵ��̱� ������ new ���� �ʰ�
		 * import �Ŀ� Ŭ������ .�� �� ȣ���� �� �ִ�
		 */
		
		//static �޼ҵ� ȣ��
		MyUtil.send();
		//static �ʵ� ����
		String v=MyUtil.version;
		System.out.println();
	}
}
