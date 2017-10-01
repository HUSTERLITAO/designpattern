package Singleton;

public class Singleton {

	private static Singleton instance=null;
	
	private  Singleton(){
		
	}
	
	
	/*
	 *静态工程变量，创建实例
	 */
	private static Singleton getinstance(){
		if(instance=null){
			instance=new Singleton;
		}
		return instance;
	}
	
	/*
	 *如果该变量被用于实例化，可以保证对象在实例化前后一致
	 */
	public Object readResolve(){
		return instance;
	}

}


/*
 
 public class Singleton{
 
 private Singleton(){
 
 }
 
 private static class SingletonFactory{
 
 	private static Singleton instance=new instance;
 	
 	
 }
 
 public static Singleton getInstance(){
 
  	return SingletonFactory.instance;
 
 }
 
 public Object readResolve(){
 		return getInstance;
 }
 
 
 }
 
 
 
 
 */