package Command;

public class MyCommend implements Commend {

	private Receiver receiver;
	
	public MyCommend(Receiver receiver){
		this.receiver=receiver;
	}
	
	public void exe(){
		receiver.exe();
	}
}
