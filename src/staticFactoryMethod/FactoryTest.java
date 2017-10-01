package staticFactoryMethod;

import mlituFactoryMethod.Sender;

public class FactoryTest {

	public static void main(String[] args){
		Sender sender=SendFactory.produceMail();
		sender.Send();
	}
	
}
