package Command;

public class Invoker {

	private Commend commend;
	
	public Invoker(Commend commend){
		this.commend=commend;
	}
	
	public void action(){
		commend.exe();
	}
	
}
