package test.main;

import test.mypac.Messenger;
import test.mypac.Radio;

public class MainClass05 {

	public static void main(String[] args) {
	//Messenger Ŭ������ sendMessage(), getMessage(), useRadio() �޼ҵ� ȣ��	
		
		Messenger.sendMessage("�Ⱦ���");
		String a =Messenger.getMessage();
		Messenger.useRadio(new Radio());
		Messenger.getMessage();
	}
	
}
