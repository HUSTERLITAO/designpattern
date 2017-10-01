package Interpreter;

import javax.naming.Context;

public class Minus implements Exception {
	
	public int interpret(Context context){
		return context.getNum1-context.getNum2;
	}

}
