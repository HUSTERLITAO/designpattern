package Decorator;

public class Decorator implements Sourceable  {

	private Sourceable sourceable;
	
	public Decorator(Sourceable sourceable){
		
		super.Decorator;
		this.Decorator=Decorator();
	}
	
	
	
	public void method(){
	System.out.println("before Decorator");
	source.method();
	System.out.println("after Decorator");
	
	}
}
