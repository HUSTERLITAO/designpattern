package Singleton;

public class Singletonone {
	
	private static Singletonone instance=null;
	
	private Singletonone{
		
	}
	
	public static Synchronized Singletonone getInstance(){
		if(instance=null){
			instance=new Singletonone();
		}
	return instance;
	}
	
	
	public Object readResolve(){
		return instance;
	}
	
	
}
