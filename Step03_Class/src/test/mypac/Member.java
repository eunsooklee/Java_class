package test.mypac;
/*
 *  Member 객체에 회원의 번호, 이름, 주소를 담고 싶다면
 *  클래스를 어떻게 설계를 해야 할까?
 *  
 *  저장소(필드)가 3개 필요하다
 *  필드의 type은 int, String, String
 */

public class Member {
	public int num;
	public String name;
	public String addr="";
    //필드는 초기화 자동으로 돼서 생략 가능
	
	//메소드
	public void showInfo() {
		//this 는 객체 자신의 참조값을 가리키는 예약어
		System.out.println("번호:"+this.num+" 이름:"+this.name+" 주소:"+this.addr);
		//this가 생략 가능하지만 메소드 안에 변수가 있을때 구별을 위해 써야한다.
		//변수이름이 같을시 this를 안쓰면 메소드 안에 변수를 가리킨다
		//f5를 누르면 안으로 추적해서 들어올 수 있다.
	}
}
