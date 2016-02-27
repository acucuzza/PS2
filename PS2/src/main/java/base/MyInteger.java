package base;

public class MyInteger {
	
	// Declaring iValue
	private static int iValue;

	// Constructor
	public MyInteger(int iValue) {
		MyInteger.iValue = iValue;
	}
	
	// Create getter
	public int getiValue() {
		return iValue;
	}
	
	// iValue Methods
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if(iValue % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isPrime() {
		for (int i = 2; i <= iValue/2; i++) {
			if (iValue % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Static Methods for specified value

	public static boolean isEven(int integer) {
		if (integer % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int integer) {
		if (integer % 2 != 0) {
			return true;
			} 
		else {
			return false;
		}
	}

	public static boolean isPrime(int integer) {
		for (int i = 2; i <= i/2; i++) {
			if (integer % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Static Methods for MyInteger

	public static boolean isEven(MyInteger myinteger) {
		if (myinteger.getiValue() % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}


	public static boolean isOdd(MyInteger myinteger) {
		if (myinteger.getiValue() % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrime(MyInteger myinteger) {
		if (myinteger.getiValue() % 2 == 0) {
			return true;
		}
		else  {
			return false;
		}
		
	}
	
	//Equals methods
	
	public static boolean equals(int integer ){
		if(integer == iValue){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean equals(MyInteger myinteger){
		if (iValue == myinteger.getiValue()) {
			return true;
		}
		else{
			return false;
		}
	}
}