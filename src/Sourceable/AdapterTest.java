package Sourceable;

public class AdapterTest {

	
	public static void main(String[] args){
	sourceable source1=new SourceSub1();
	sourceable source2=new SourceSub2();
	
	source1.method1();
	source1.method2();
	source2.method1();
	source2.method2();
	}
}
