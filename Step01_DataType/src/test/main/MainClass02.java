package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		int kor=95;
		int eng=100;
		
		float avg;
		avg = ((float)kor+(float)eng)/2;
		//double avg=(kor+eng)/2.0;
		System.out.println("국어점수와 영어점수의 평균은"+avg+"입니다.");
		//정수와 정수를 연산하면 정수만 나오기 때문에
		//정확한 실수 값을 얻어내기 위해서는 연산에 참여하는 숫자중에 적어도 하나는 실수가 되어야힌다.
	
}
}
