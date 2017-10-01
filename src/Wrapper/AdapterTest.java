package Wrapper;

public class AdapterTest {

	public void void main(String[] args){
	
	Source source=new Source();
	Targetable target=new Wraper(source);
	target.method1();
	target.method2();
	}
	
}
