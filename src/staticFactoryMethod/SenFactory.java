package staticFactoryMethod;

public class SenFactory{
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}

}
