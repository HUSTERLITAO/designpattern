package AbstractFactory;

public class SendMailFactory implements Sender {

	public void produce(){
		return new MailSender();
	}
	
}
