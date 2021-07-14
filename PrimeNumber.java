package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=13;int reminder;
		boolean flag = false;
		for (int j = 2; j < input/2; j++) {
			reminder=input/j;
			if (reminder==0) {
				flag= true;break;
			}
		}
		if (flag== true) {
			System.out.println("it is not a prime number");
		}
		else {
			System.out.println(" it is a prime number");
		}
	}

}
