package test.main;
/*
 *  java ���� �⺻ ������ type 8 ���� ������ �������� ��� ���� ������ type�̴�.
 *  ���� ������ type ��ü�� heap����(�繰�Կ���) �� ����� ����.
 *  ��� ��ü�� �����(�ʵ�)�� ���(�޼ҵ�)���� �����Ǿ� ���� �� �ִ�.
 *  � ����ҿ� � ����� ������ ������ �ش� type ��ü�� ��� ���� �Ǿ��Ŀ� ���� �ٸ���.
 *  
 *  ��������.�� ������ ����Ҹ� ���� �ϰų� ����� ����� �� �ִ�.
 *  ��������.�� ������ �ʵ带 ���� �ϰų� �޼ҵ带 ȣ���� �� �ִ�.
 *  �޼ҵ� ȣ���� javascript ���� �Լ� ȣ��� �����ϴ�.
 */
public class MainClass08 {
	public static void main(String[] args) {
		String str="abcde12345";
		int result=str.length();
		char result2=str.charAt(5);
		String a = str.toUpperCase();
		//1
		String str2 = str.toUpperCase();
		//2
		String greet = "Hello! mimi, Bye! mimi";
		String greet2 = greet.replaceAll("mimi", "mama");
		//3
		String message="My name is Kim";
		boolean isStart=message.startsWith("My");
		int index=message.indexOf("i");
		
		System.out.println(str2);
		System.out.println(greet2);
		System.out.println(isStart);
		System.out.println(index);
	}

}
