package mediator;

public class mediatorTest {

	public static void main(String[] args){
		
		Mediator mediator=new MyMediator();
		mediator.createMediator();
		
		mediator.workAll();
	}
}
