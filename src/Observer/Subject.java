package Observer;

public interface Subject  {

	/*���ӹ۲���*/
	public void add(Observer observer);
	
	/*ɾ���۲���*/
	public void delete(Observer observer);
	
	/*֪ͨ���еĹ۲���*/
	public void notifyObserver();
	
	/*����Ĺ۲�*/
	public void operation();
	
}
