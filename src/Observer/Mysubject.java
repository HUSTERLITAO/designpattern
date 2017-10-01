package Observer;

public class Mysubject extends AbstractSubject {
	
	public void operation(){
		System.out.println("update safety!");
		notifyObserver();
	}

}
