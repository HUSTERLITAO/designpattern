package mediator;

public abstract class User {

	private Mediator mediator;
	
	public Mediator getMediator(){
		return mediator;
	}
	
	public abstract void work();
	
}
