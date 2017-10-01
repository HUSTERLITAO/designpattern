package Wrapper;

public class Wraper implements Targetable  {

	public Source source;
	
	public void Wraper(Source source){
		super.Wraper();
		this.source=source;
	}
	
	public void method2(){
		System.out.println("this is method2");
	}
	
	public void method1(){
		source.method1();
	}
	
	
	
}
