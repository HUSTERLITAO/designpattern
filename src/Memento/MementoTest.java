package Memento;

public class MementoTest {

	public static void main(String[] args){
		
		//创建原始类
		Original orig=new Original("egg");
		
		//创建备忘录
		Storage storage=new Storage(orig.createMemento);
		
		System.out.println("初始状态为"+orig.getValue());
		orig.setValue("niu");
		System.out.println("修改后的状态为"+ orig.getValue());
		
		
		//恢复原始类的状态
		orig.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为:"+orig.getValue());
	}
	
}
