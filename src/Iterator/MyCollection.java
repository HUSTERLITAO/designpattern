package Iterator;

public class MyCollection implements Collection {
	public String string[]={"A","B","C","D","E"};
	
	public Iterator iterator(){
		return new MyIterator(this);
	} 
	
	public Object get(int i){
		return String[i];
	}
	
	public int size(){
		return string.length;
	}

	
	
}
