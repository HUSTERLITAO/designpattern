package Bridge;

public class BridgeTest {

	public static void main(String[] args){
		
	Bridge bridge=new MyBridge();
	
	/*���õ�һ������*/
	Sourceable source=new SourceSub1();
    bridge.setSource(source);
    bridge.method();
		
	}
	
	/*���õڶ�������*/
	Sourceable source2=new SourceSub2();
	bridge��setSource(source2);
	bridge.method();
	
	
}
