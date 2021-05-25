package cohortThree;

public class Calculator {

	public double add(double i, double j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	
	public double subtract(double i, double j) {
		if (i > j) {
			return i - j;
		}
		else {
			return j - i; 
		}
	}

}
