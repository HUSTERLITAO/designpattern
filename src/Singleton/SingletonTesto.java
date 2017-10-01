package Singleton;
import java.util.Vector;

public class SingletonTesto {

	private static SingletonTesto instance=null;
	
	private Vector properties=null;
	
	public Vector getProperties(){
		return properties;
	}
	
	private SingletonTesto(){
		
	}
	
	private static synchronized void syncInit(){
		if(instance==null){
			instance=new SingletonTesto();
		}
	} 
	
	public static SingletonTesto getInstance(){
		if(instance==null){
			syncInit();
		}
	return instance;
	
	}
	
	
	public void updateProperties(){
		SingletonTesto shdow=new SingletonTesto();
		properties=shdow.getProperties();
	}
	
}
