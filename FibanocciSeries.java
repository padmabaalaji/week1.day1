package week1.day1.assignments;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=6,firstNum=0,secNum=1,sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 0; i < range; i++) {
			sum= firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
	}

}
