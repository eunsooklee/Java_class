package test.main;

import test.mypac.Messenger;
import test.mypac.Radio;

public class MainClass05 {

	public static void main(String[] args) {
	//Messenger 클래스의 sendMessage(), getMessage(), useRadio() 메소드 호출	
		
		Messenger.sendMessage("팔아파");
		String a =Messenger.getMessage();
		Messenger.useRadio(new Radio());
		Messenger.getMessage();
	}
	
}
