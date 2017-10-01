package Singleton;

public class Singleton {

	private static Singleton instance=null;
	
	private  Singleton(){
		
	}
	
	
	/*
	 *��̬���̱���������ʵ��
	 */
	private static Singleton getinstance(){
		if(instance=null){
			instance=new Singleton;
		}
		return instance;
	}
	
	/*
	 *����ñ���������ʵ���������Ա�֤������ʵ����ǰ��һ��
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