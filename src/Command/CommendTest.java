package Command;

public class CommendTest {

	public static void main(String[] args){
		Receiver receiver=new Receiver();
		Commend commend=new MyCommend(receiver);
		Invoker invoker=new Invoker(commend);
		invoker.action();
	}
	
}
