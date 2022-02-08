package junit;

public class Calculator {
	boolean isEven(int number) {
		if((number%2)==0) {
			return true;
		}
		return false;
	}
	
	boolean isOdd(int number) {
		if(number%2 != 0) {
			return true;
		}
		return false;
	}
}
