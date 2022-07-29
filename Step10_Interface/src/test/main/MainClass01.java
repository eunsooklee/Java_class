package test.main;

import java.util.ArrayList;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static <E> void main(String[] args) {
		Remocon r1=new MyRemocon();
		r1.up();
		r1.down();
		/*
		 *  �ʵ峪 ���������� final �̶�� ���� ���̸� ������ �ƴϰ� ����� �ȴ�.
		 *  ����� ���� ������� �ʴ� ���� ����̴�
		 *  ���� �Ʒ��� num, name, r2�� �ٸ� ���� �ٽ� �����Ҽ��� ����.
		 */
		final int num=10;
		final String name="lee";
		final Remocon r2=new MyRemocon();
		
		/*
		 * ���ʻ� final ���������� �ʵ�� ��� �빮�ڷ� ǥ���Ѵ�.
		 * ���ڸ� ���ȭ ��Ű�� ������ ���ڿ� �̸��� �ο��ϴ� ȿ���� �ش�.
		 * ���ڿ��� ���ȭ ��Ű�� ȥ���ϱ� ���� ���ڿ��� �̸��� �ο��ϴ� ȿ���� �ش�.
		 * ���α׷��Ӱ� ������ ���ڳ� ȥ���ϱ� ���� ���ڿ��� ���� �ҷ��� ���� �ֵ��� ������ �ش�
		 */
		final double PI=3.14159;
		final String GREET_KOR="�ȳ�";
		final String GREET_ENG="hi";
		//�������̽��� static final �ʵ� �����ϱ�
		String a=Remocon.COMPANY;
		
		new ArrayList<E>();
	}
}
