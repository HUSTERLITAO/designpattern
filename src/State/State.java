package State;

public class State {

	private String value;
	
	public String  getValue(){
		return value;
	}
	
	public void setValue(String value){
		this.value=value;
	}
	
	public void method1(){
		System.out.println("excute the first method");
		
	}
	
	public void method2(){
		System.out.println("excute the second method");
	}
}
