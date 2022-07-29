package test.main;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		int num1=10;
		double num2=10.1;
		boolean isRun=true;
		String myName="lee";
		
		num1=20;
		//num1=true; 안됨
		
		num1=20;
		num2=20.2;
		isRun=false;
		myName="rooroo";
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
