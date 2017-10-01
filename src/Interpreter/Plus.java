package Interpreter;

import javax.naming.Context;

public class Plus implements Exception {
	
	public int interpret(Context context){
		return context.getNum1()+context.getNum2();
	}

}
