package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("시작");
		//String type을 담을 수 있는 방 3개짜리 빈 배열 객체를 만들어서 참조값을 지역변수 names에 담기
		String[] names=new String[3];
		names[0]="a";
		names[1]="b";
		names[2]="c";
		
		//반복문 배열 출력
		for(int i=0; i < names.length; i++) {
			String tmp=names[i];
			System.out.println(tmp);
			//System.out.println(names[i]);
		}
	}
}
