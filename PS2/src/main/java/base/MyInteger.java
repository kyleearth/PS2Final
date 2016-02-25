package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int number) {
		iValue = number;
	}

	public int get() {
		return iValue;
	}

	// ***********************************************
	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (iValue % 2 == 0)
			return false;
		else
			return true;
	}

	public boolean isPrime() {
		// check if its a multiple of 2
		if (iValue % 2 == 0)
			return false;
		// if not, check the odds
		else {
			for (int i = 3; i * i <= iValue; i += 2) {
				if (iValue % i == 0)
					return false;
			}
			return true;
		}
	}

	// ***********************************************
	public static boolean isEven(int x) {
		if (x % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int x) {
		if (x % 2 == 0)
			return false;
		else
			return true;
	}

	public static boolean isPrime(int x) {
		// check if its a multiple of 2
		if (x % 2 == 0)
			return false;
		// if not, check the odds
		else {
			for (int i = 3; i * i <= x; i += 2) {
				if (x % i == 0)
					return false;
			}
			return true;
		}
	}

	// ***********************************************
	public static boolean isEven(MyInteger y) {
		return y.isEven();
	}

	public static boolean isOdd(MyInteger y) {
		return y.isOdd();
	}

	public static boolean isPrime(MyInteger y) {
		return y.isPrime();
	}

	// ***********************************************
	public boolean equals(int vaule) {
		if (vaule == iValue) {
			return true;
		} else
			return false;
	}

	public boolean equals(MyInteger z) {
		return z.equals(z);
	}
	// ***********************************************
}
