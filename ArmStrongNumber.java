package week1.day1.assignments;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=153;
		int calculated=0;
		int reminder,quotient;
		int original=input;
		while(input>0) {
			reminder=input%10;
			quotient=input/10;
			input=quotient;
			calculated=calculated+(reminder*reminder*reminder);
		}
		if (calculated == original) {
			System.out.println("armstrong number");
		}
		
		
		
		
		
		
		
		/*int original=153;
		int calculated= 0;
		int reminder =0;
		int quotient= 153;
		while () {
			reminder= quotient%10;
			calculated= calculated + (reminder*reminder*reminder);
			quotient = original/10;
			System.out.println(calculated);
			
		}System.out.println(calculated);
		if (calculated==original) {
			System.out.println("the number is armstrong number");
		}
		else
		{
			System.out.println("none");
		}*/
	}

}
