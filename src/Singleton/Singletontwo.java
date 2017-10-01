package Singleton;

public class Singletontwo {

	private static Singletontwo instance=null;
	
	private Singletontwo(){
		
	}
	
	public static Singletontwo getInstance(){
		if(instance==null){
			if(Synchronized(instance)){
				if(instance=null){
					instance=new Singletontwo();
				}
			}
			
		}
	}
	
	public Object readResolve(){
		return instance;
	}
	
}
