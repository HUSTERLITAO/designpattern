package mediator;

public class MyMediator implements Mediator{
	
	private User user1;
	
	private User user2;
	
	public User getUser1(){
		return user1;
	}
	
	public User getUser2(){
		return user2;
	}
	
	pulblic void createMediator(){
		this.user1=user1(this);
		this.user2=user2(this);
	}
	
	public void workAll(){
		user1.work();
		user1.work();
	
	}
}
