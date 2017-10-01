package strategy;

public class Multiply {

	public int calculator(String exp){
		int arrayInt[] =split(exp,"\\*");
		return arrayInt[0]*arrayInt[1];
	}
	
}
