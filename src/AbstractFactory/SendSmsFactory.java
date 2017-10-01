package AbstractFactory;

public class SendSmsFactory implements provider {

	public void SmsSender(){
		
		public Sender produce(){
			return new SmsSender();
		}
	}
}
